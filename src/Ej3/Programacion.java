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
public class Programacion {
    ArrayList <Sala> salas = new ArrayList <Sala>();

    public Programacion() {
    }
    
    public void agregarSalas(Sala sala){
        salas.add(sala);
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
}
