package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TestCSV {

    @Test
    public void testCargarCSV() {
        CSVLoader loader = new CSVLoader();
        try {
            
            String filePath = "archivo.csv";
            List<String[]> datos = loader.cargarCSV(filePath);
            
            assertNotNull(datos);
            assertEquals(3, datos.size()); 
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }
}


