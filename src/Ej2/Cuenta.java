/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldoActual;
    private Date dateCreation;
    private String nomCliente;
    ArrayList <Movimiento> movimientos = new ArrayList <Movimiento>();

    public Cuenta(int numeroCuenta, double saldoActual, Date dateCreation, String nomCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dateCreation = dateCreation;
        this.nomCliente = nomCliente;               
    }

    public void agregarMovimiento(int cantidad, Tipo tipo){
        Date fecha = new Date();  
        Movimiento mov = new Movimiento(fecha, saldoActual, cantidad, tipo);
        movimientos.add(mov);   
        if (Integer.parseInt(tipo.getCodigo()) == 1) {
            saldoActual += cantidad;
        } else if(Integer.parseInt(tipo.getCodigo()) == 2){
            saldoActual -= cantidad;
    }
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldoActual;
    }

    public void setSaldo(double saldo) {
        this.saldoActual = saldo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public ArrayList<Movimiento> getCantMovimientos() {
        return movimientos;
    }

    public void setCantMovimientos(ArrayList<Movimiento> cantMovimientos) {
        this.movimientos = cantMovimientos;
    }
    
    
}
