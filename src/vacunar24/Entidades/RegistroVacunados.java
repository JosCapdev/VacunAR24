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
public class RegistroVacunados {
    private int idRegistroVacunados;
    private Ciudadano persona;
    private int codRefuerzo;
    private String centroVacunacion;
    private String fechaHoraColoc;
    private Vacuna dosis;
    private Profesional prof;
    private int numSerieDosis;

    public int getIdRegistroVacunados() {
        return idRegistroVacunados;
    }

    public void setIdRegistroVacunados(int idRegistroVacunados) {
        this.idRegistroVacunados = idRegistroVacunados;
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
    
    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public String getFechaHoraColoc() {
        return fechaHoraColoc;
    }

    public void setFechaHoraColoc(String fechaHoraColoc) {
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

    public RegistroVacunados() {
    }

    public RegistroVacunados(int idRegistroVacunados, Ciudadano persona, int codRefuerzo, String centroVacunacion, String fechaHoraColoc, Vacuna dosis, Profesional prof, int numSerieDosis) {
        this.idRegistroVacunados = idRegistroVacunados;
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
        this.prof = prof;
        this.numSerieDosis = numSerieDosis;
    }

    public RegistroVacunados(Ciudadano persona, int codRefuerzo, String centroVacunacion, String fechaHoraColoc, Vacuna dosis, Profesional prof, int numSerieDosis) {
        this.persona = persona;
        this.codRefuerzo = codRefuerzo;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColoc = fechaHoraColoc;
        this.dosis = dosis;
        this.prof = prof;
        this.numSerieDosis = numSerieDosis;
    }

}
