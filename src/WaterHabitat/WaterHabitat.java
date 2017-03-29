/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WaterHabitat;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class WaterHabitat {
    
    //Atribut
    public Cell nilai_water;

    public WaterHabitat() {
        nilai_water = new Cell();
        nilai_water.setNilaiCell(2);
    }

    public WaterHabitat(WaterHabitat w) {
        setNilaiWater(w.getNilaiWater());
    }
    
    public Cell getNilaiWater() {
        return nilai_water;
    }

    public void setNilaiWater(Cell nilai_water) {
        this.nilai_water = nilai_water;
    }
    
    public void render() {
        System.out.print("$");
    }
    
}
