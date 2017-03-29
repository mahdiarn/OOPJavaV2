/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirHabitat;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class AirHabitat {
    
    //Atribut
    public Cell nilai_air;

    public AirHabitat() {
        nilai_air = new Cell();
        nilai_air.setNilaiCell(3);
    }
    
    public AirHabitat(AirHabitat a) {
        setNilaiAir(a.getNilaiAir());
    }

    public Cell getNilaiAir() {
        return nilai_air;
    }

    public void setNilaiAir(Cell nilai_air) {
        this.nilai_air = nilai_air;
    }
    
    public void render() {
        System.out.print("@");
    }
    
}
