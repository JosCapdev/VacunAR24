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
public class Insumos {
    private int idInsumo;
    private Vacuna vac;
    private String otros;
    private String centroVacunacion;
    private int alcohol;
    private LocalDate fech;
    private boolean enviado;

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public Vacuna getVac() {
        return vac;
    }

    public void setVac(Vacuna vac) {
        this.vac = vac;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public LocalDate getFech() {
        return fech;
    }

    public void setFech(LocalDate fech) {
        this.fech = fech;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public Insumos() {
    }

    public Insumos(int idInsumo, Vacuna vac, String otros, String centroVacunacion, int alcohol, LocalDate fech, boolean enviado) {
        this.idInsumo = idInsumo;
        this.vac = vac;
        this.otros = otros;
        this.centroVacunacion = centroVacunacion;
        this.alcohol = alcohol;
        this.fech = fech;
        this.enviado = enviado;
    }

    public Insumos(Vacuna vac, String otros, String centroVacunacion, int alcohol, LocalDate fech, boolean enviado) {
        this.vac = vac;
        this.otros = otros;
        this.centroVacunacion = centroVacunacion;
        this.alcohol = alcohol;
        this.fech = fech;
        this.enviado = enviado;
    }

    public Insumos(String otros, String centroVacunacion, int alcohol, LocalDate fech, boolean enviado) {
        this.otros = otros;
        this.centroVacunacion = centroVacunacion;
        this.alcohol = alcohol;
        this.fech = fech;
        this.enviado = enviado;
    }
    
    
}
