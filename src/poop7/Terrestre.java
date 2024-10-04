/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoologico;

/**
 *
 * @author USER
 */
public class Terrestre extends Animal {
    
    private int patas;
    private float size;

    public Terrestre() {
    }

    public Terrestre(int patas, float size, String nombre) {
        super(nombre);
        this.patas = patas;
        this.size = size;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
    
    public void Caminar(){
        System.out.println("La habilidad de el "+getNombre()+" es caminar... Cca - mi - nar");
    }

    @Override
    public String toString() {
        return super.toString() + " patas = " + patas + ", size = " + size + "cm";
    }
    
    
    
    
    
    
    
    
    
}
