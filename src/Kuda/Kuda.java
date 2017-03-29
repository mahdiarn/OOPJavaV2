/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuda;
import Animal.Animal;
import java.util.Random;
/**
 *
 * @author Mahdiar Naufal
 */
public class Kuda{
    public Animal animal;
    
    
    //Constructor tanpa parameter
    public Kuda(){
        animal = new Animal();
    }
    
    //Constructor dengan parameter
    public Kuda(int _weight, 
            int _tipe, 
            int _x,
            int _y) {
        animal = new Animal(_weight,_tipe,_x,_y);
    }
    
    //Copy Constructor
    public Kuda(Kuda k) {
        this.animal = new Animal (k.animal);
    }
    
    public void Eat() {
        System.out.println("Porsi makanan kuda ini adalah " + animal.getWeight()*0.025 + " kg."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Interact() {
        Random rand;
        rand = new Random();
        
        int n = rand.nextInt(3);
        
        if (n == 0){
            System.out.println("Kuda : \"Zzzzzz......\"");
        } else if (n == 1) {
            System.out.println("Kuda : \"YIHA!!!!! HUSH!!!!\"");
        } else if (n == 2) {
            System.out.println("Kuda : \"Nyam.. Nyam..\"");
        }
        
    }
    
    public void render() {
        System.out.print("U");
    }
}
