/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cell;

/**
 *
 * @author Aya Aurora
 */
public class Cell {

    
    //Atribut
    private int nilai_cell;
    
    //Constructor tanpa parameter
    public Cell() {
       nilai_cell = 0;
    }
    
    //Constructor dengan parameter 
    public Cell(int _nilai_cell) {
        nilai_cell = _nilai_cell;
    }
    
    //Copy Constructor
    public Cell (Cell c) {
        nilai_cell  = c.nilai_cell;
    }
    
    /**
     * @return the nilai_cell
     */
    public int getNilaiCell() {
        return nilai_cell;
    }

    /**
     * @param nilai_cell the nilai_cell to set
     */
    public void setNilaiCell(int nilai_cell) {
        this.nilai_cell = nilai_cell;
    }
}
