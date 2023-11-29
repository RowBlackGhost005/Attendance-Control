/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataAccess;

import model.AsistenciaAlumnoCurso;

/**
 *
 * @author rc0nt
 */
public interface IDAOasistencia {
    public AsistenciaAlumnoCurso get(String id);
    public AsistenciaAlumnoCurso[] getAll();
    public void write(AsistenciaAlumnoCurso asistencia);
}
