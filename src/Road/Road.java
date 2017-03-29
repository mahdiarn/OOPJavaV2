/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Road;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class Road {
    
    //Atribut
    public Cell nilai_road;

    public Road() {
        nilai_road = new Cell();
        nilai_road.setNilaiCell(-1);
    }

    public Road(Road r) {
        setNilaiRoad(r.getNilaiRoad());
    }
    
    public Cell getNilaiRoad() {
        return nilai_road;
    }

    public void setNilaiRoad(Cell nilai_road) {
        this.nilai_road = nilai_road;
    }
    
    public void render() {
        System.out.print("-");
    }
}
