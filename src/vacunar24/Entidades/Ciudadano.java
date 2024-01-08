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
public class Ciudadano extends Persona {
    private int idCiudadano;
    private String patologia;
    private String ambitoLab;
    private String domicilio;
    private String localidad;
    private String Provincia;

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoLab() {
        return ambitoLab;
    }

    public void setAmbitoLab(String ambitoLab) {
        this.ambitoLab = ambitoLab;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String patologia, String ambitoLab, String domicilio, String localidad, String Provincia, int dni, String nombre, String apellido, String email, String celular, boolean estado) {
        super(dni, nombre, apellido, email, celular, estado);
        this.idCiudadano = idCiudadano;
        this.patologia = patologia;
        this.ambitoLab = ambitoLab;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.Provincia = Provincia;
    }

    public Ciudadano(String patologia, String ambitoLab, String domicilio, String localidad, String Provincia, int dni, String nombre, String apellido, String email, String celular, boolean estado) {
        super(dni, nombre, apellido, email, celular, estado);
        this.patologia = patologia;
        this.ambitoLab = ambitoLab;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.Provincia = Provincia;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "idCiudadano=" + idCiudadano + ", patologia=" + patologia + ", ambitoLab=" + ambitoLab + ", domicilio=" + domicilio + ", localidad=" + localidad + ", Provincia=" + Provincia + '}';
    }

    

    
}
