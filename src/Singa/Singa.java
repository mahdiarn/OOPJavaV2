/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singa;
import Animal.Animal;
import java.util.Random;
/**
 *
 * @author Aulia Ichsan Rifkyano + Aya
 */
public class Singa{
   public Animal animal;
    
    
    //Constructor tanpa parameter
    public Singa(){
        animal = new Animal();
    }
    
    //Constructor dengan parameter
    public Singa(int _weight, 
            int _tipe, 
            int _x,
            int _y) {
        animal = new Animal(_weight,_tipe,_x,_y);
    }
    
    //Copy Constructor
    public Singa(Singa s) {
        this.animal = new Animal (s.animal);
    }
    
    public void Eat() {
        System.out.println("Porsi makanan singa ini adalah " + animal.getWeight()*0.025 + " kg."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Interact() {
        Random rand;
        rand = new Random();
        
        int n = rand.nextInt(3);
        
        if (n == 0){
            System.out.println("Singa : \"Zzzzzz......\"");
        } else if (n == 1) {
            System.out.println("Singa : \"ROAR!!\"");
        } else if (n == 2) {
            System.out.println("Singa : \"Nyam.. Nyam..\"");
        }
        
    }
    
    public void render() {
        System.out.print("S");
    }
}
