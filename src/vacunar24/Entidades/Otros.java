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
public class Otros {
    private int idOtros;
    private String asunto;
    private String descr;
    private LocalDate fech;

    public int getIdOtros() {
        return idOtros;
    }

    public void setIdOtros(int idOtros) {
        this.idOtros = idOtros;
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

    public Otros() {
    }

    public Otros(int idOtros, String asunto, String descr, LocalDate fech) {
        this.idOtros = idOtros;
        this.asunto = asunto;
        this.descr = descr;
        this.fech = fech;
    }

    public Otros(String asunto, String descr, LocalDate fech) {
        this.asunto = asunto;
        this.descr = descr;
        this.fech = fech;
    }
  
}
