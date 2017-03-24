/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zebra;

/**
 *
 * @author Mahdiar Naufal
 */
public class Zebra {
    //Atribut
    public int weight;
    public int tipe;
    public int location_x;
    public int location_y;
    
    
    //Constructor tanpa parameter
    public Zebra () {
        weight = 0;
        tipe = 0;
        location_x = -1;
        location_y = -1;
    }
    
    //Constructor dengan parameter
    public Zebra (int _weight, 
            int _tipe, 
            boolean _tamed,
            int _x,
            int _y) {
        weight = _weight;
        tipe = _tipe;
        location_x = _x;
        location_y = _y;
    }
    
    //Copy Constructor
    public Zebra (Zebra s) {
        weight = s.weight;
        tipe = s.tipe;
        location_x = s.location_x;
        location_y = s.location_y;
    }
    
    //setter
    public void setWeight(int x) {
        weight = x;
    }
    public void setTipe (int x) {
        tipe = x;
    }
    public void setX (int x) {
        location_x = x;
    }
    public void setY (int y) {
        location_y = y;
    }
    
    
    //getter
    public int getWeight() {
        return weight;
    }    
    public int getTipe() {
        return tipe;
    }
    public int getX () {
        return location_x;
    }
    public int getY () {
        return location_y;
    }
}
