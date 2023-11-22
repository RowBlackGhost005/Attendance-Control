package model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author rc0nt
 */
public class AsistenciaAlumnoCurso {
    
    private String id;
    private String idAlumno;
    private String idCurso;
    private boolean[] asistencias;

    public AsistenciaAlumnoCurso(String id, String idAlumno, String idCurso, boolean[] asistencias) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
        this.asistencias = asistencias;
    }

    public AsistenciaAlumnoCurso() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public boolean[] getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(boolean[] asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        String asistencia = "";
        if(asistencias!=null)  {
            for (int i = 0; i < asistencias.length; i++) {
                asistencia = asistencia + (asistencias[i]?"1":"0") + ",";
            }
        }
        return "AsistenciaAlumnoCurso{" + "id=" + id + ", idAlumno=" + idAlumno + ", idCurso=" + idCurso + ", asistencias=" + asistencia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.idAlumno);
        hash = 53 * hash + Objects.hashCode(this.idCurso);
        hash = 53 * hash + Arrays.hashCode(this.asistencias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AsistenciaAlumnoCurso other = (AsistenciaAlumnoCurso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idAlumno, other.idAlumno)) {
            return false;
        }
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return Arrays.equals(this.asistencias, other.asistencias);
    }
    
    
}
