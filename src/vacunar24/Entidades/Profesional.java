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
public class Profesional extends Persona {
    private int idProfesional;
    private int matricula;

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Profesional() {
    }

    public Profesional(int matricula, int dni, String nombre, String apellido, String email, String celular) {
        super(dni, nombre, apellido, email, celular);
        this.matricula = matricula;
    }

    public Profesional(int idProfesional, int matricula, int dni, String nombre, String apellido, String email, String celular) {
        super(dni, nombre, apellido, email, celular);
        this.idProfesional = idProfesional;
        this.matricula = matricula;
    }
    
}
