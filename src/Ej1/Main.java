/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Diego", 123);
        Rueda r1 = new Rueda(16);
        Rueda r2 = new Rueda(20);
        Motor m1 = new Motor(2500, 1);
        Motor m2 = new Motor(3000, 2);
        Carro c1 = new Carro("Toyota", 1, 1, "Camioneta", m2);
        c1.agregarRuedas(r2);
        Carro c2 = new Carro("Hyundai", 2, 2, "Automovil", m1);
        c1.agregarRuedas(r1);
        Carro c3 = new Carro("Renault", 3, 2, "Automovil", m1); 
        c1.agregarRuedas(r2);
        p1.agregarCarro(c1);
        p1.agregarCarro(c2);
        p1.agregarCarro(c3);
        p1.listarCarros();
    }    
}