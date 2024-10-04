/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *Clase de un Empleado
 * @author Alejandro
 */
public class Empleado {
    
    /**
     * Atributos
     */
    private String nombre;
    private int noempleado;
    private float sueldo;

    /**
     * Constructor vacio
     */
    public Empleado() {
    }

    /**
     * Constructor lleno
     * @param nombre
     * @param noempleado
     * @param sueldo 
     */
    public Empleado(String nombre, int noempleado, float sueldo) {
        this.nombre = nombre;
        this.noempleado = noempleado;
        this.sueldo = sueldo;
    }
    
    /**
     * Devolver el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Definir el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devolver el numero de empleado
     * @return 
     */
    public int getNoempleado() {
        return noempleado;
    }

    /**
     * Definir el numero de empleado
     * @param noempleado 
     */
    public void setNoempleado(int noempleado) {
        this.noempleado = noempleado;
    }

    /**
     * Devolver sueldo
     * @return 
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Definir el sueldo
     * @param sueldo 
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Sumar el aumento al sueldo del empleado
     * @param porcentajeDeAumento 
     */
    public void aumentarsueldo(int porcentajeDeAumento ){
        sueldo += (sueldo*porcentajeDeAumento/(100));
        
    }

    /**
     * Imprimir los atributos del empleado
     * @return 
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", noempleado=" + noempleado + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
    
    
    
}
