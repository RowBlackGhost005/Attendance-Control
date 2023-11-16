package pruebas;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;

public class CSVLoader {
    public List<String[]> cargarCSV(String rutaArchivo) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(rutaArchivo));
        return reader.readAll();
    }
}
