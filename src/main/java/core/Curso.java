package core;

public class Curso {

    String nombre;
    Grupo grupos[];
    
    public Curso(String nombre){
        this.nombre = nombre;
    }
    
    public Curso(String nombre, Grupo grupos[]){
        this.nombre = nombre;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
}
