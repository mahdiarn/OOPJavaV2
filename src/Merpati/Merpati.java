/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merpati;
import Animal.Animal;
import java.util.Random;
/**
 *
 * @author Aulia Ichsan Rifkyano + Aya
 */
public class Merpati{
    public Animal animal;
    
    
    //Constructor tanpa parameter
    public Merpati(){
        animal = new Animal();
    }
    
    //Constructor dengan parameter
    public Merpati(int _weight, 
            int _tipe, 
            int _x,
            int _y) {
        animal = new Animal(_weight,_tipe,_x,_y);
    }
    
    //Copy Constructor
    public Merpati(Merpati m) {
        this.animal = new Animal (m.animal);
    }
    
    public void Eat() {
        System.out.println("Porsi makanan merpati ini adalah " + animal.getWeight()*0.025 + " kg."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Interact() {
        Random rand;
        rand = new Random();
        
        int n = rand.nextInt(3);
        
        if (n == 0){
            System.out.println("Merpati : \"Zzzzzz......\"");
        } else if (n == 1) {
            System.out.println("Merpati : \"Cuit.. Cuit..\"");
        } else if (n == 2) {
            System.out.println("Merpati : \"Nyam.. Nyam..\"");
        }
        
    }
    
    public void render() {
        System.out.print("M");
    }
}
