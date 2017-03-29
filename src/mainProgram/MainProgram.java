/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProgram;
import driver.Driver;
import java.io.*;
import java.util.*;
/**
 *
 * @author Mahdiar Naufal
 */
public class MainProgram {
    public static void main (String[] Args) throws FileNotFoundException {
        Driver drive = new Driver();
        drive.PrintMap(0, 0,20,20);
        drive.PrintLegend();
        drive.PrintInterface();
        drive.InputPilihan();
    }
}
