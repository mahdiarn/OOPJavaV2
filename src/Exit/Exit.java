/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exit;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class Exit {
    
    //Atribut
    public Cell nilai_exit;

    public Exit() {
        nilai_exit = new Cell();
        nilai_exit.setNilaiCell(-5);
    }

    public Exit(Exit e) {
        setNilaiExit(e.getNilaiExit());
    }
    
    public Cell getNilaiExit() {
        return nilai_exit;
    }

    public void setNilaiExit(Cell nilai_exit) {
        this.nilai_exit = nilai_exit;
    }
    
    public void render() {
        System.out.print("-");
    }
}
