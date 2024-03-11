/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Entidades;

import java.time.LocalDate;
/**
 *
 * @author Jose
 */
public class CitaVacunacion {
    private int idCitaVacunacion;
    private Ciudadano persona;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String centroVacunacion;
    private Vacuna dosis;

    public int getIdCitaVacunacion() {
        return idCitaVacunacion;
    }

    public void setIdCitaVacunacion(int idCitaVacunacion) {
        this.idCitaVacunacion = idCitaVacunacion;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
    }

    public int getCodRefuerzo() {
        return codRefuerzo;
    }

    public void setCodRefuerzo(int codRefuerzo) {
        this.codRefuerzo = codRefuerzo;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }

    public CitaVacunacion() {
    }

    public CitaVacunacion(int idCitaVacunacion, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, Vacuna dosis) {
        this.idCitaVacunacion = idCitaVacunacion;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.dosis = dosis;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, Vacuna dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "idCitaVacunacion=" + idCitaVacunacion + ", persona=" + persona + ", codRefuerzo=" + codRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", dosis=" + dosis + '}';
    }

}
