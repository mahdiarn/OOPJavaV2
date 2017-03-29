/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Aulia Ichsan Rifkyano
 */
public class Animal {
    public int weight;
    public int tipe;
    public int location_x;
    public int location_y;
    
    //constructor tanpa parameter
    public Animal(){
        weight = 0;
        tipe = 0;
        location_x = 0;
        location_y = 0;
    }
    
    //constructor dengan parameter
    public Animal(int _weight, 
            int _tipe, 
            int _x,
            int _y){
        
        weight = _weight;
        tipe = _tipe;
        location_x = _x;
        location_y = _y;        
    }
    
    //cctor
    //Copy Constructor
    public Animal(Animal a) {
        weight = a.weight;
        tipe = a.tipe;
        location_x = a.location_x;
        location_y = a.location_y;
    }
    
    //setter
    public void setWeight(int x) {
        weight = x;
    }
    public void setTipe(int x) {
        tipe = x;
    }
    public void setX(int x) {
        location_x = x;
    }
    public void setY(int y) {
        location_y = y;
    }
    
    
    //getter
    public int getWeight() {
        return weight;
    }
    
    public int getTipe() {
        return tipe;
    }
    
    
    public int getX() {
        return location_x;
    }
    public int getY() {
        return location_y;
    }
    
}
