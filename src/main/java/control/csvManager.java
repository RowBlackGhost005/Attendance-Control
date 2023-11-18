/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

/**
 *
 * @author danielsalas
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvManager {

    public static void readCSV(String filePath) {
        String line = "";
        String csvSplitBy = ","; // Cambiar en caso de utilizar otro separador.

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                
                for (String value : data) {
                    System.out.print(value + " ");
                }
                System.out.println(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readCSV("src/main/resources/ejemploCSV.csv");
    }
}

