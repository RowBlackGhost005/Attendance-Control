/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author danielsalas
 */
public class grupo {
    String nombre;
    String nombreDelCurso;
    String[] horario;
    // Alumno alumno;
    // Maestro maestro;
    
    public grupo(String nombre, String nombreDelCurso, String[] horario){
        nombre = this.nombre;
        nombreDelCurso = this.nombreDelCurso;
        horario = this.horario;
    }
    
    //TODO Clase que contenga alumnos y maestros para poder hacer un nuevo constructor de la siguiente manera:
    /*
    public grupo(String nombre, String nombreDelCurso, String[] horario, Alumno[] alumnos, Maestro maestro){
        nombre = this.nombre;
        nombreDelCurso = this.nombreDelCurso;
        horario = this.horario;
        alumnos = this.alumnos;
        maestro = this.maestro
    }
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }
    
    
    
}
