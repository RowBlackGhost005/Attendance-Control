/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataAccess;

import model.Curso;

/**
 *
 * @author rc0nt
 */
public interface IDAOcurso {
    
    public Curso get(String id);
    public Curso[] getAll();
    public void write(Curso curso);
}
