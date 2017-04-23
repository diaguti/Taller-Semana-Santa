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
public class Sala {
    private int numSala;
    ArrayList <Semana> semanas = new ArrayList <Semana>();

    public Sala(int numSala) {
        this.numSala = numSala;
    }

    public void agregarSemana(Semana semana){
        semanas.add(semana);
    }
    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }

}