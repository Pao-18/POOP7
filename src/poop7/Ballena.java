/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Ballena extends Acuatico {
    
    private String tipo;

    public Ballena() {
    }

    public Ballena(String tipo, int cantidad, float size, String nombre) {
        super(cantidad, size, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void Devorar(){
        System.out.println("La ballena "+tipo+ " se comio a Pinocho");
    }

    @Override
    public String toString() {
        return super.toString() + ",tipo = " + tipo;
    }
    
    
    
    
    
    
}
