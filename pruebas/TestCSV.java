package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestCSV {

    @Test
    public void testCargarCSV() {
        CSVLoader loader = new CSVLoader();
        try {
            List<String[]> datos = loader.cargarCSV("C:\\Users\\felip\\OneDrive\\Escritorio\\Proyecto Final\\archivo.csv");
            assertNotNull(datos);
            assertEquals(3, datos.size()); // Ajusta este valor según la cantidad de filas en tu archivo CSV
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }
}
