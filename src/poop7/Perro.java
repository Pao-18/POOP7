/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Perro extends Terrestre {
    
    private String raza;

    public Perro() {
    }

    public Perro(String raza, int patas, float size, String nombre) {
        super(patas, size, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    public void ladrar(){
        System.out.println("El "+raza+" ladra al cartero");
    }

    @Override
    public String toString() {
        return super.toString() + " ,raza = " + raza;
    }
    
    
    
    
    
}