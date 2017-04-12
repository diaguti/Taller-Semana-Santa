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
public class Chasis {
    private int idChasis;
    private String clase;

    public Chasis(int idChasis, String clase) {
        this.idChasis = idChasis;
        this.clase = clase;
    }

    public int getIdChasis() {
        return idChasis;
    }

    public void setIdChasis(int idChasis) {
        this.idChasis = idChasis;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    
}
