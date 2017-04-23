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
public class Dia {
    private String fecha;
    private String nombre;
    ArrayList <Segmento> segmentos = new ArrayList <Segmento>();

    public Dia(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public void agregarSegmento(Segmento segmento){
        segmentos.add(segmento);
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }
    
    
}
