package pruebas;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSV {
    public List<String[]> cargarCSV(String rutaArchivo) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(rutaArchivo));
        return reader.readAll();
    }


       public void editarCSV(String filePath, List<String[]> nuevosDatos) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            for (String[] row : nuevosDatos) {
                StringBuilder rowString = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    rowString.append(row[i]);
                    if (i < row.length - 1) {
                        rowString.append(",");
                    }
                }
                writer.append(rowString.toString()).append("\n");
            }
        }
    }

    public void guardarCSV(String rutaArchivo, List<String[]> datos) throws Exception {
        try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
            writer.writeAll(datos);
        }
     }
}
