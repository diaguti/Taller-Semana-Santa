/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Banco {
   private String codigo;
   private Tipo tipo;
   private Cuenta cuenta;
   ArrayList <Cuenta> cuentas = new ArrayList <Cuenta>();

    public Banco(String codigo) {
        this.codigo = codigo;
    }

    public void listarInfo(){
        for (int i = 0; i < cuentas.size(); i++) { 
            System.out.print("Cliente " + cuentas.get(i).getNomCliente());
            System.out.print(" con numero de cuenta " + cuentas.get(i).getNumeroCuenta());
            System.out.println(" actualmente tiene un saldo de " + cuentas.get(i).getSaldo());
            System.out.println("Los movimientos que ha realizado en la cuenta son: ");
            for (int j = 0; j < cuentas.get(i).getCantMovimientos().size(); j++) {
                if (Integer.parseInt(cuentas.get(i).getCantMovimientos().get(j).getTipo().getCodigo()) == 1) {
                    System.out.println("\t" + (j+1) + ". Se realizo una consignacion el dia"
                            + " " + cuentas.get(i).getCantMovimientos().get(j).getDate()
                    + " de un valor de " + cuentas.get(i).getCantMovimientos().get(j).getCantidad() + " dejando en la cuenta un saldo"
                            + " de " + (cuentas.get(i).getCantMovimientos().get(j).getSaldoAnterior()+cuentas.get(i).getCantMovimientos().get(j).getCantidad()));
                } else if(Integer.parseInt(cuentas.get(i).getCantMovimientos().get(j).getTipo().getCodigo()) == 2){
                   System.out.println("\t" + (j+1) + ". Se realizo un retiro el dia " + cuentas.get(i).getCantMovimientos().get(j).getDate()
                    + " de un valor de " + cuentas.get(i).getCantMovimientos().get(j).getCantidad() + " dejando en la cuenta un saldo"
                            + " de " + (cuentas.get(i).getCantMovimientos().get(j).getSaldoAnterior()- cuentas.get(i).getCantMovimientos().get(j).getCantidad())); 
                }
            }
        }
        
    }
    
    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
   
   
}
