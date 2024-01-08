/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Entidades;

/**
 *
 * @author Jose
 */
public abstract class Persona {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String celular;
    protected boolean estado;

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido, String email, String celular, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular + ", estado=" + estado + '}';
    }

   
}
