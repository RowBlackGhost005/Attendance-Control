/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Kevin Rios
 */
public class Docente {
    private Long id;
    private String nombre;
    private Long matricula;
    private String telefono;
    private String correo;
    private String contrasena;

    public Docente() {
    }

    public Docente(Long id, String nombre, Long matricula, String telefono, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Docente(String nombre, Long matricula, String telefono, String correo, String contrasena) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.matricula);
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
        final Docente other = (Docente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Docente{" + "id=" + id + ", nombre=" + nombre + ", matricula=" + matricula + ", telefono=" + telefono + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    }
    
    
}
