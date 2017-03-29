/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerapah;
import Animal.Animal;
import java.util.Random;
/**
 *
 * @author Aulia Ichsan Rifkayno + Aya
 */
public class Jerapah{
    public Animal animal;
    
    
    //Constructor tanpa parameter
    public Jerapah(){
        animal = new Animal();
    }
    
    //Constructor dengan parameter
    public Jerapah(int _weight, 
            int _tipe, 
            int _x,
            int _y) {
        animal = new Animal(_weight,_tipe,_x,_y);
    }
    
    //Copy Constructor
    public Jerapah(Jerapah j) {
        this.animal = new Animal (j.animal);
    }
    
    public void Eat() {
        System.out.println("Porsi makanan jerapah ini adalah " + animal.getWeight()*0.025 + " kg."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Interact() {
        Random rand;
        rand = new Random();
        
        int n = rand.nextInt(3);
        
        if (n == 0){
            System.out.println("Jerapah : \"Zzzzzz......\"");
        } else if (n == 1) {
            System.out.println("Jerapah : \"Kress...\"");
        } else if (n == 2) {
            System.out.println("Jerapah : \"Nyam.. Nyam..\"");
        }
        
    }
    
    public void render() {
        System.out.print("J");
    }
}
