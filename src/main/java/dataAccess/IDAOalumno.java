/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataAccess;

import model.Alumno;

/**
 *
 * @author rc0nt
 */
public interface IDAOalumno {
    
    public Alumno get(String id);
    public Alumno[] getAll();
    public void write(Alumno alumno);
}
