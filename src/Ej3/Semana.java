/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;

/**
 *
 * @author FAMILIA
 */
public class Semana {
    private int numero;
    private Dia[] dias = new Dia[5];
    ArrayList <Sala> salas = new ArrayList <Sala>();  

    public Semana(int numero) {
        this.numero = numero;
    }

    public void agregarSala(Sala sala){
        salas.add(sala);
    }
    
//    public void agregarDias(Dia dia){
//        dias[0] = new Dia(fecha, nombre)
//    }
    public void calcularEspaciosLibres(){
        
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    
    
}