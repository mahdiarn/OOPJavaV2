/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrance;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class Entrance {
    
    //Atribut
    public Cell nilai_entrance;

    public Entrance() {
        nilai_entrance = new Cell();
        nilai_entrance.setNilaiCell(-4);
    }

    public Entrance(Entrance e) {
        setNilaiEntrance(e.getNilaiEntrance());
    }
    
    public Cell getNilaiEntrance() {
        return nilai_entrance;
    }

    public void setNilaiEntrance(Cell nilai_entrance) {
        this.nilai_entrance = nilai_entrance;
    }
    
    public void render() {
        System.out.print("-");
    }
}
