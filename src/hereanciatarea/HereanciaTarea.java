/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hereanciatarea;

import ico.fes.animal.Animal;
import ico.fes.animal.Gato;
import ico.fes.animal.Perro;

/**
 *
 * @author dania
 */
public class HereanciaTarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato g1 =new Gato("siames", "Meow", 4);
        Perro p1= new Perro("Chihuahua", "Guof!", 4);
        
        System.out.println("La raza del Gato es: "+g1.getRaza());
        System.out.println(p1);
    }
    
}
