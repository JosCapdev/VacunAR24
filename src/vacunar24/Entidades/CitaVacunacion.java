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
    private int idCita;
    private Ciudadano persona;
    private int codRefuerzo;
    private String fechaHoraCita;
    private String citaVacunacion;
    private LocalDate fechaHoraColoc;
    private Vacuna dosis;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
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

    public String getCitaVacunacion() {
        return citaVacunacion;
    }

    public void setCitaVacunacion(String citaVacunacion) {
        this.citaVacunacion = citaVacunacion;
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

    public CitaVacunacion(int idCita, Ciudadano persona, int codRefuerzo, String fechaHoraCita, String citaVacunacion, LocalDate fechaHoraColoc, Vacuna dosis) {
        this.idCita = idCita;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.citaVacunacion = citaVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
    }

    public CitaVacunacion(Ciudadano persona, int codRefuerzo, String fechaHoraCita, String citaVacunacion, LocalDate fechaHoraColoc, Vacuna dosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.citaVacunacion = citaVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
    }
    
    
}
