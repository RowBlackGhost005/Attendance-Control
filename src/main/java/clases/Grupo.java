package clases;

import java.util.ArrayList;
import java.util.Date;

public class Grupo {
    
   private String nombre;
   private ArrayList<Alumno> alumnos;
   private ArrayList<Date> dias;

   public Grupo(String nombre, ArrayList<Alumno> alumnos, ArrayList<Date> dias) {
      this.nombre = nombre;
      this.alumnos = alumnos;
      this.dias = dias;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public void setAlumnos(ArrayList<Alumno> alumnos) {
       this.alumnos = alumnos;
   } 

   public void setDias(ArrayList<Date> dias) {
       this.dias = dias;
   }

   public String getNombre() {
       return nombre;
   }

   public ArrayList<Alumno> getAlumnos() {
       return alumnos;
   }
   
   public ArrayList<Date> getDias() {
       return dias;
   }
}
