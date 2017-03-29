/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Park;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class Park {
    
    //Atribut
    public Cell nilai_park;

    public Park() {
        nilai_park = new Cell();
        nilai_park.setNilaiCell(-2);
    }

    public Park(Park p) {
        setNilaiPark(p.getNilaiPark());
    }
    
    public Cell getNilaiPark() {
        return nilai_park;
    }

    public void setNilaiPark(Cell nilai_park) {
        this.nilai_park = nilai_park;
    }
    
    public void render() {
        System.out.print("~");
    }
    
}
