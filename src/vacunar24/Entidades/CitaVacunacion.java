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
    private LocalDate fechaHoraColoc;
    private Vacuna dosis;
    private Profesional prof;
    private int numSerieDosis;

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

    public LocalDate getFechaHoraColoc() {
        return fechaHoraColoc;
    }

    public void setFechaHoraColoc(LocalDate fechaHoraColoc) {
        this.fechaHoraColoc = fechaHoraColoc;
    }

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }

    public Profesional getProf() {
        return prof;
    }

    public void setProf(Profesional prof) {
        this.prof = prof;
    }

    public int getNumSerieDosis() {
        return numSerieDosis;
    }

    public void setNumSerieDosis(int numSerieDosis) {
        this.numSerieDosis = numSerieDosis;
    }

    public CitaVacunacion() {
    }

    public CitaVacunacion(int idCitaVacunacion, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoc, Vacuna dosis, Profesional prof, int numSerieDosis) {
        this.idCitaVacunacion = idCitaVacunacion;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
        this.prof = prof;
        this.numSerieDosis = numSerieDosis;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoc, Vacuna dosis, Profesional prof, int numSerieDosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
        this.prof = prof;
        this.numSerieDosis = numSerieDosis;
    }

}
