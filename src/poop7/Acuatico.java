/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Acuatico extends Animal {
    
    private int cantidad;
    private float size;

    public Acuatico() {
    }

    public Acuatico(int cantidad, float size, String nombre) {
        super(nombre);
        this.cantidad = cantidad;
        this.size = size;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
    
    public void nadar(){
        System.out.println("El "+ getNombre() + " canta nadaremos");
    }

    @Override
    public String toString() {
        return super.toString() + "cantidad = " + cantidad + ", size = " + size + "cm ";
    }
    
    
    
    
    
    
}

