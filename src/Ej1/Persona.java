/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private int documento;   
    ArrayList <Carro> cantCarros = new  ArrayList <Carro>();

    public Persona(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
    }
    public void agregarCarro(Carro car){
        cantCarros.add(car);
    }

    public void listarCarros(){
        for (int i = 0; i < cantCarros.size(); i++) {
            System.out.println("carro " + cantCarros.get(i).getIdCarro());
            System.out.println("Marca " + cantCarros.get(i).getMarca());
            System.out.println("Motor " + cantCarros.get(i).getMotor().getPotencia());
            System.out.println("Chasis " + cantCarros.get(i).getChasis().getClase());  
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public ArrayList<Carro> getCantCarros() {
        return cantCarros;
    }

    public void setCantCarros(ArrayList<Carro> cantCarros) {
        this.cantCarros = cantCarros;
    }
    
    
}
