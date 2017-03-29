/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zebra;
import Animal.Animal;
import java.util.Random;
/**
 *
 * @author Aulia Ichsan RIfkyano + Aya
 */
public class Zebra{
    public Animal animal;
    
    
    //Constructor tanpa parameter
    public Zebra(){
        animal = new Animal();
    }
    
    //Constructor dengan parameter
    public Zebra(int _weight, 
            int _tipe, 
            int _x,
            int _y) {
        animal = new Animal(_weight,_tipe,_x,_y);
    }
    
    //Copy Constructor
    public Zebra(Zebra z) {
        this.animal = new Animal (z.animal);
    }
    
    public void Eat() {
        System.out.println("Porsi makanan zebra ini adalah " + animal.getWeight()*0.025 + " kg."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Interact() {
        Random rand;
        rand = new Random();
        
        int n = rand.nextInt(3);
        
        if (n == 0){
            System.out.println("Zebra : \"Zzzzzz......\"");
        } else if (n == 1) {
            System.out.println("Zebra : \"YIHA!!!!!\"");
        } else if (n == 2) {
            System.out.println("Zebra : \"Nyam.. Nyam..\"");
        }
        
    }
    
    public void render() {
        System.out.print("Z");
    }
}
