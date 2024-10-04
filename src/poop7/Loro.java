/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Loro extends Aereo{
    
    private String tipo;

    public Loro() {
    }

    public Loro(String tipo, float size, String color, String nombre) {
        super(size, color, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void Bailar(){
        System.out.println("Este guacamayo está bailando samba");
    }
    
    public void Picotear(){
        System.out.println("El "+getNombre()+" "+tipo+" me mordio");
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo = " + tipo;
    }
    
    
    
    
}