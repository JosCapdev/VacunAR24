/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacunar24.Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public int getIdCitaVacunacion() {
        return idCitaVacunacion;
    }

    public void setIdCitaVacunacion(int idCita) {
        this.idCitaVacunacion = idCita;
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

    public void setCentroVacunacion(String citaVacunacion) {
        this.centroVacunacion = citaVacunacion;
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

    public CitaVacunacion() {
    }

    public CitaVacunacion(int idCitaVacunacion, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoc, Vacuna dosis) {
        this.idCitaVacunacion = idCitaVacunacion;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, String fechaHoraCita, String centroVacunacion, LocalDate fechaHoraColoc, Vacuna dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
    }
    
    
}
