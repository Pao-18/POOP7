/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Aereo extends Animal {
    
    private float size;
    private String color;

    public Aereo() {
    }

    public Aereo(float size, String color, String nombre) {
        super(nombre);
        this.size = size;
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Volar(){
        System.out.println("El ave de color "+color+" se fue volando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", size = " + size + "cm, color = " + color;
    }
    
    
    
    
    
    
    
    
}
