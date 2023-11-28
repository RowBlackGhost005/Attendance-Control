package core;

public class Curso {

    String nombre;
    grupo grupos[];
    
    public Curso(String nombre){
        this.nombre = nombre;
    }
    
    public Curso(String nombre, grupo grupos[]){
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(grupo[] grupos) {
        this.grupos = grupos;
    }
}
