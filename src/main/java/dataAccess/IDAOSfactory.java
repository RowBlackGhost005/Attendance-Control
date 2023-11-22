/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataAccess;

/**
 *
 * @author rc0nt
 */
public interface IDAOSfactory {
    public IDAOalumno getAlumnoDAO();
    public IDAOasistencia getAsistenciaDAO();
    public IDAOcurso getCursoDAO();
}
