package pruebas;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCSV {

    @Test
    public void testCargarCSV() {
        CSV cargar = new CSV();
        try {

            String filePath = "archivo.csv";
            List<String[]> datos = cargar.cargarCSV(filePath);

            assertNotNull(datos);
            assertEquals(3, datos.size());
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testEditarCSV() {
        CSV cargar = new CSV();
        try {
            // Genera datos de prueba
            List<String[]> nuevosDatos = new ArrayList<>();

            nuevosDatos.add(new String[]{"Persona1", "Persona2", "Persona3"});
            
            Path filePath = Paths.get("src", "test", "resources", "archivo.csv");

            List<String[]> datosAntiguos = cargar.cargarCSV(filePath.toString());

            cargar.editarCSV(filePath.toString(), nuevosDatos);

            List<String[]> datosEditados = cargar.cargarCSV(filePath.toString());

            assertNotNull(datosAntiguos);
            assertNotNull(datosEditados);
            assertEquals(datosAntiguos.size(), datosEditados.size());

            assertTrue(datosEditados.containsAll(nuevosDatos));

        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testGuardarCSV() {
        CSV csvLoader = new CSV();
        String rutaArchivo = "src/test/resources/test_salida.csv";

        try {
            // Crear datos de prueba directamente en el método
            List<String[]> datosParaGuardar = Arrays.asList(
                    new String[]{"Dato1", "Dato2"},
                    new String[]{"Dato3", "Dato4"}
            );

            // Guarda los datos
            csvLoader.guardarCSV(rutaArchivo, datosParaGuardar);

            // Verifica que el archivo se haya creado
            assertTrue(java.nio.file.Files.exists(java.nio.file.Paths.get(rutaArchivo)));

            // Carga los datos desde el archivo recién creado
            List<String[]> datosGuardados = csvLoader.cargarCSV(rutaArchivo);

            // Verifica que los datos guardados sean los mismos que los datos originales
            assertEquals(datosParaGuardar.size(), datosGuardados.size());
            for (int i = 0; i < datosParaGuardar.size(); i++) {
                assertArrayEquals(datosParaGuardar.get(i), datosGuardados.get(i));
            }
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

}
