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
public class Carro {
    private int idCarro;
    private String marca;
    private Rueda[] rueda;
    private Motor motor;
    private Chasis chasis;

    public Carro(String marca, int idCarro, int idChasis, String clase, Motor motor) {
        this.marca = marca;
        this.idCarro = idCarro;
        rueda = new Rueda[4];
        this.chasis = new Chasis(idChasis, clase);
        this.motor = motor;
        
    }

    public void cambiarMotor(Motor motor){
        setMotor(motor);
    }
    
    public void agregarRuedas(Rueda rueda){
        for (int i = 0; i < 4; i++) {
            this.rueda[i] = rueda;
        }
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdCarro() {
        return idCarro;
    }
    

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public Rueda[] getRueda() {
        return rueda;
    }

    public void setRueda(Rueda[] rueda) {
        this.rueda = rueda;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
        
}
