/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

/**
 *
 * @author danielsalas
 */
import dataAccess.DAOSfactory;
import dataAccess.IDAOasistencia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import model.AsistenciaAlumnoCurso;
import model.Curso;

public class csvManager {

    public static String readCSV(String filePath) {
        String line = "";
        String csvSplitBy = ","; // Cambiar en caso de utilizar otro separador.
        String fullData = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            fullData = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                
                for (String value : data) {
                    fullData = fullData + value + ",";
                }
                fullData = fullData +"\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return fullData;
    }

    public static void saveCSVattendance(String filePath, Curso curso) {
        String line = "";
        String csvSplitBy = ","; // Cambiar en caso de utilizar otro separador.
        AsistenciaAlumnoCurso[] asistencias = new AsistenciaAlumnoCurso[0];
        AsistenciaAlumnoCurso[] asistencias1;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                
                asistencias1 = new AsistenciaAlumnoCurso[asistencias.length+1];
                System.arraycopy(asistencias, 0, asistencias1, 0, asistencias.length);
                
                AsistenciaAlumnoCurso asistencia = new AsistenciaAlumnoCurso();
                asistencias1[asistencias.length] = asistencia;
                asistencia.setIdAlumno(data[0]);
                asistencia.setIdCurso(curso.getId());
                
                boolean[] asis = new boolean[data.length-1];
                for (int i = 0; i < asis.length; i++) {
                    asis[i] = data[i+1].equals("1");
                }
                asistencia.setAsistencias(asis);
                
                asistencias = asistencias1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (AsistenciaAlumnoCurso asistencia : asistencias) {
            System.out.println(asistencia.toString());
        }
        
        IDAOasistencia dao = new DAOSfactory().getAsistenciaDAO();
        for (AsistenciaAlumnoCurso asistencia : asistencias) {
            dao.write(asistencia);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(readCSV("src/main/resources/ejemploCSV.csv"));
        System.out.println(readCSV("src/main/resources/ejemploCSVasistencia.csv"));
        saveCSVattendance("src/main/resources/ejemploCSVasistencia.csv", new Curso("1","","",""));
    }
}

