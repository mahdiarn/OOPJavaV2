/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;
import Cell.Cell;
/**
 *
 * @author Aya Aurora
 */
public class Restaurant {
    
    //Atribut
    public Cell nilai_resto;

    public Restaurant() {
        nilai_resto = new Cell();
        nilai_resto.setNilaiCell(-3);
    }

    public Restaurant(Restaurant r) {
        setNilaiResto(r.getNilaiResto());
    }
    
    public Cell getNilaiResto() {
        return nilai_resto;
    }

    public void setNilaiResto(Cell nilai_resto) {
        this.nilai_resto = nilai_resto;
    }
    
    public void render() {
        System.out.print("&");
    }
}
