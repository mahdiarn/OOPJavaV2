/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LandHabitat;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class LandHabitat {
    
    //Atribut
    public Cell nilai_land;

    public LandHabitat() {
        nilai_land = new Cell();
        nilai_land.setNilaiCell(1);
    }
    
    
    public LandHabitat(LandHabitat l) {
        setNilaiLand(l.getNilaiLand());
    }

    public Cell getNilaiLand() {
        return nilai_land;
    }

    public void setNilaiLand(Cell nilai_land) {
        this.nilai_land = nilai_land;
    }    
    
    public void render() {
        System.out.print("#");
    }
}
