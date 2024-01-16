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
public class Vacuna {
    private int idVacuna;
    private int numSerieDosis;
    private String marca;
    private double medida;
    private LocalDate fechaVto;
    private boolean colocada;
    private boolean estado;

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getNumSerieDosis() {
        return numSerieDosis;
    }

    public void setNumSerieDosis(int numSerieDosis) {
        this.numSerieDosis = numSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDate getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(LocalDate fechaVto) {
        this.fechaVto = fechaVto;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vacuna() {
    }

    public Vacuna(int idVacuna, int numSerieDosis, String marca, double medida, LocalDate fechaVto, boolean colocada, boolean estado) {
        this.idVacuna = idVacuna;
        this.numSerieDosis = numSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVto = fechaVto;
        this.colocada = colocada;
        this.estado = estado;
    }

    public Vacuna(int numSerieDosis, String marca, double medida, LocalDate fechaVto, boolean colocada, boolean estado) {
        this.numSerieDosis = numSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaVto = fechaVto;
        this.colocada = colocada;
        this.estado = estado;
    }

    
}
