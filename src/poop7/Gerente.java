/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *Clase que hereda los atributos de empleado para convertirse en Gerente
 * @author Alejandro
 */
public class Gerente extends Empleado {
    
    /**
     * Atributos 
     */
    private float presupuesto;

    /**
     * Constructor vacio
     */
    public Gerente() {
    }

    /**
     * Constructor lleno
     * @param presupuesto
     * @param nombre
     * @param noempleado
     * @param sueldo 
     */
    public Gerente(float presupuesto, String nombre, int noempleado, float sueldo) {
        super(nombre, noempleado, sueldo);
        this.presupuesto = presupuesto;
    }

    /**
     * Devolver presupesto
     * @return 
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Definir el presupuesto
     * @param presupuesto 
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float asignarPresupuesto(float presupuesto){
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
        
    }
    
    
    
    
    
    
    
    
    
    
}