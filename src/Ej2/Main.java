/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha = new Date();
        Tipo t1 = new Tipo("1");
        Tipo t2 = new Tipo("2");
        Banco banco = new Banco("123");
        Cuenta c1 = new Cuenta(111, 1000000, fecha, "Diego");
        Cuenta c2 = new Cuenta(222, 500000, fecha, "Felipe");
        banco.agregarCuenta(c1);
        banco.agregarCuenta(c2);
        c1.agregarMovimiento(50000, t1);
        c1.agregarMovimiento(100000, t1);
        c1.agregarMovimiento(10000, t2);
        c2.agregarMovimiento(500000, t2);
        c2.agregarMovimiento(1000000, t1);
        banco.listarInfo();
    }
    
}
