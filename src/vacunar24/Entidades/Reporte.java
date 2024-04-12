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
public class Reporte {
    private int idReporte;
    private String asunto;
    private String descr;
    private LocalDate fech;
    private boolean rev;

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public LocalDate getFech() {
        return fech;
    }

    public void setFech(LocalDate fech) {
        this.fech = fech;
    }

    public boolean isRev() {
        return rev;
    }

    public void setRev(boolean rev) {
        this.rev = rev;
    }

    public Reporte() {
    }

    public Reporte(int idReporte, String asunto, String descr, LocalDate fech, Boolean rev) {
        this.idReporte = idReporte;
        this.asunto = asunto;
        this.descr = descr;
        this.fech = fech;
        this.rev = rev;
    }

    public Reporte(String asunto, String descr, LocalDate fech, Boolean rev) {
        this.asunto = asunto;
        this.descr = descr;
        this.fech = fech;
        this.rev = rev;
    }
  
}
