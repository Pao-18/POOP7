/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;


import Zoologico.Acuatico;
import Zoologico.Animal;
import Zoologico.Terrestre;
import Zoologico.Aereo;
import Zoologico.Ballena;
import Zoologico.Loro;
import Zoologico.Perro;

/**
 *
 * @author Alejandro
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Empleado empleado = new Empleado("Emiliano",342674,20000f);
       Empleado empleado2 = new Empleado("Axel",58241,30000f);
        System.out.println(empleado);
        empleado.aumentarsueldo(10);
        System.out.println(empleado);
        System.out.println(empleado2);
        Gerente gerente1 = new Gerente(1000f,"Oscar",321,20000f);
        System.out.println(gerente1);
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        gerente2.setPresupuesto(100);
        System.out.println(gerente2);
        gerente2.setNombre("Alan");
        System.out.println(gerente2);
        System.out.println(gerente2.getNombre());
        System.out.println("\n");
        
        Animal animal = new Animal();
        System.out.println(animal);
        
        Animal animal2 = new Animal("Gusano");
        System.out.println(animal2);
        
        Acuatico animal3 = new Acuatico();    
        System.out.println(animal3);
        animal3.setNombre("Pez betta");
        animal3.setCantidad(6);
        animal3.setSize(11);
        System.out.println(animal3);
        animal3.nadar();
        Acuatico animal4 = new Acuatico(1,700,"Tiburon peregrino");
        System.out.println(animal4);
        System.out.println(animal4.getNombre());
        animal4.nadar();
        Ballena ballena1 = new Ballena();
        System.out.println(ballena1);
        ballena1.setNombre("Ballena");
        ballena1.setCantidad(1);
        ballena1.setSize(570);
        ballena1.setTipo("Piloto");
        System.out.println(ballena1);
        Ballena ballena2 = new Ballena("Gris",2,1500,"Ballena");
        System.out.println(ballena2);
        ballena2.Devorar();
        System.out.println("\n");       
        
        Terrestre animal5 = new Terrestre();
        System.out.println(animal5);
        animal5.setNombre("Osos Polar");
        animal5.setPatas(4);
        animal5.setSize(240);
        System.out.println(animal5);
        animal5.Caminar();
        Terrestre animal6 = new Terrestre(4,200,"Leon");
        System.out.println(animal6);
        System.out.println(animal6.getNombre()); 
        animal6.Caminar();
        Perro perro1 = new Perro();
        System.out.println(perro1);
        perro1.setNombre("Perro");
        perro1.setPatas(4);
        perro1.setRaza("Pug");
        perro1.setSize(32);
        System.out.println(perro1);
        Perro perro2 = new Perro("Dalmata",4,58,"Perro");
        System.out.println(perro2);
        perro2.ladrar();
        System.out.println("\n ");
        
        Aereo animal7 = new Aereo();
        System.out.println(animal7);
        animal7.setNombre("Pelicano");
        animal7.setSize(65);
        animal7.setColor("Negro");
        System.out.println(animal7);
        animal7.Volar();
        Aereo animal8 = new Aereo(95,"Rosa","Flamenco");
        System.out.println(animal8);
        System.out.println(animal8.getNombre());
        animal8.Volar();
        Loro loro1 = new Loro();
        System.out.println(loro1);
        loro1.setNombre("Loro");
        loro1.setColor("Azul");
        loro1.setSize(90);
        loro1.setTipo("Guacamaya");
        loro1.Bailar();
        Loro loro2 = new Loro("Cacatua",60,"blanco","Loro");
        System.out.println(loro2);
        loro2.Picotear();
        
        
        
    }
    
}