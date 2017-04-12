/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Movimiento {
    private Date date;
    private double saldoAnterior;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(Date date, double saldoAnterior, double cantidad, Tipo tipo) {
        this.date = date;
        this.saldoAnterior = saldoAnterior;
        this.cantidad = cantidad;    
        this.tipo = tipo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
