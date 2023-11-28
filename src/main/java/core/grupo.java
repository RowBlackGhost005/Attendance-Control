package core;

public class grupo {
    String nombre;
    String nombreDelCurso;
    String[] horario;
    
    public grupo(String nombre, String nombreDelCurso, String[] horario){
        nombre = this.nombre;
        nombreDelCurso = this.nombreDelCurso;
        horario = this.horario;
    }

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
