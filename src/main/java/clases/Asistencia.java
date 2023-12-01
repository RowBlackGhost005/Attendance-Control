
package clases;


import java.time.LocalTime;

public class Asistencia {

    private Alumno alumno;
    private Boolean presente = false;
    private LocalTime horaLlegada;


    public Asistencia(Alumno alumno, boolean asistencia, LocalTime horaLlegada) {
        this.alumno = alumno;
        this.presente = asistencia;
        this.horaLlegada = horaLlegada;
    }

    public void setPresente(Boolean asistencia) {
        this.presente = asistencia;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Boolean getPresente() {
        return presente;
    }

    public String getNombreAlumno() {
        return alumno.getNombre();
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

}
