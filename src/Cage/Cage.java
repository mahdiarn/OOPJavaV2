/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cage;

import Animal.Animal;
import Beruang.Beruang;
import BigBlueOct.BigBlueOct;
import Cendrawasih.Cendrawasih;
import EastPacRedOct.EastPacRedOct;
import Ebosia.Ebosia;
import Elang.Elang;
import Harimau.Harimau;
import HiuPutih.HiuPutih;
import Jerapah.Jerapah;
import Kelelawar.Kelelawar;
import Kucing.Kucing;
import Kuda.Kuda;
import Lionfish.Lionfish;
import LumbaLumba.LumbaLumba;
import Merpati.Merpati;
import Okapi.Okapi;
import Panda.Panda;
import Penyu.Penyu;
import Rajawali.Rajawali;
import Singa.Singa;
import Zebra.Zebra;

/**
 *
 * @author Rizky Faramita 13515055@std.stei.itb.ac.id
 * @version 1.1 (current version number of program)
 * @since 1.1 (the version of the package this class was first added to)
 */
public class Cage {
    /**
     * id dari tiap cage
     */
    private int cage_id;
    
    /**
     * absis pada map
     */
    private int x;
    
    /**
     * ordinat pada map
     */
    private int y;
    
    /**
     * id dari animal
     */
    private int animal_id;
    
    /**
     * atribut untuk membangkitkan animal tertentu, diganti melalui method SetCage
     */
    public Beruang beruang;
    public BigBlueOct big_blue_oct;
    public Cendrawasih cendrawasih;
    public EastPacRedOct east_pac_red_oct;
    public Ebosia ebosia;
    public Elang elang;
    public Harimau harimau;
    public HiuPutih hiu_putih;
    public Jerapah jerapah;
    public Kelelawar kelelawar;
    public Kucing kucing;
    public Kuda kuda;
    public Lionfish lionfish;
    public LumbaLumba lumba_lumba;
    public Merpati merpati;
    public Okapi okapi;
    public Panda panda;
    public Penyu penyu;
    public Rajawali rajawali;
    public Singa singa;
    public Zebra zebra;

    
    /**
     * meng-assign animal berdasarkan id animal
     */
    public void setAnimal(int _animal_id){
        switch (_animal_id) {
            case 1:
                kucing = new Kucing(10,2,x,y);
                break;
            case 2:
                harimau = new Harimau(200,2,x,y);
                break;
            case 3:
                singa = new Singa(150,2,x,y);
                break;
            case 4:
                jerapah = new Jerapah(1200,1,x,y);
                break;
            case 5:
                okapi = new Okapi(300,1,x,y);
                break;
            case 6:
                panda = new Panda(100,1,x,y);
                break;
            case 7:
                beruang = new Beruang(150,2,x,y);
                break;
            case 8:
                zebra = new Zebra(120,1,x,y);
                break;
            case 9:
                kuda = new Kuda(120,1,x,y);
                break;
            case 10:
                ebosia = new Ebosia(120,2,x,y);
                break;
            case 11:
                lionfish = new Lionfish(5,2,x,y);
                break;
            case 12:
                lumba_lumba = new LumbaLumba(50,2,x,y);
                break;
            case 13:
                hiu_putih = new HiuPutih(100,2,x,y);
                break;
            case 14:
                big_blue_oct = new BigBlueOct(10,2,x,y);
                break;
            case 15:
                east_pac_red_oct = new EastPacRedOct(10,2,x,y);
                break;
            case 16:
                merpati = new Merpati(5,1,x,y);
                break;
            case 17:
                rajawali = new Rajawali(25,2,x,y);
                break;
            case 18:
                elang = new Elang(35,2,x,y);
                break;
            case 19:
                kelelawar = new Kelelawar(10,2,x,y);
            case 20:
                cendrawasih = new Cendrawasih(5,1,x,y);
            case 21:
                penyu = new Penyu(30,1,x,y);
            default:
                break;
        }
    }
    
    /**
     * ctor tanpa parameter
     */
    public Cage(){
        cage_id = 0;
        x = 0;
        y = 0;
        animal_id = 0;
        this.setAnimal(animal_id);
    }
    
    /**
     * ctor dengan dua parameter integer
     * @param _x masukan untuk absis 
     * @param _y masukan untuk ordinat
     * @param _cage_id masukan untuk id cage
     * @param _animal_id masukan untuk id animal
     */
    public Cage(int _x, int _y, int _cage_id, int _animal_id){
        cage_id = _cage_id;
        x = _x;
        y = _y;
        animal_id = _animal_id;
        this.setAnimal(animal_id);
    }
    
    /**
     * cctor
     * @param c objek cage yang ingin di-assign 
     */
    public Cage(final Cage c) {
        cage_id = c.cage_id;
        x = c.x;
        y = c.y;
        animal_id = c.animal_id;
        this.setAnimal(animal_id);
    }
    
    /**
     * getter absis
     * @return kordinat x
     */
    public int getX(){
        return x;
    }
    
    /**
     * getter ordinat
     * @return kordinat y
     */
    public int getY(){
        return y;
    }
    
    /**
     * getter jenis animal
     * @return id animal 
     */
    public int getAnimalId(){
        return animal_id;
    }
    
    /**
     * getter id cage
     * @return id cage
     */
    public int getCageId(){
        return cage_id;
    }
        
    /**
     * setter cage pada kordinat tertentu
     * @param _x absis
     * @param _y ordinat
     * @param _cage_id id dari cage
     * @param _animal_id id dari animal
     */
    public void setCage(int _x, int _y, int _cage_id, int _animal_id){
        x = _x;
        y = _y;
        cage_id = _cage_id;
        animal_id = _animal_id;
        this.setAnimal(animal_id);
    }
}
