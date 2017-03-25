/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirAnimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahdiar Naufal
 */
public class AirAnimalTest {
    
    public AirAnimalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    /**
     * Testing Default parameter, of class AirAnimal.
     */
    public void testDefault() {
        System.out.println("Test Default Parameter");
        AirAnimal instance;
        instance = new AirAnimal ();
        assertTrue(instance.getWeight() == 0);
        assertTrue(instance.getTipe() == 0);
        assertTrue(instance.getX() == -1);
        assertTrue(instance.getY() == -1);
    }

    @Test
    /**
     * Testing parameter, of class AirAnimal.
     */
    public void testParameter() {
        System.out.println("Test Parameter");
        AirAnimal instance;
        instance = new AirAnimal(100,1,true,10,5);
        assertTrue(instance.getWeight() == 100);
        assertTrue(instance.getTipe() == 1);
        assertTrue(instance.getX() == 10);
        assertTrue(instance.getY() == 5);
    }
    
    @Test
    /**
     * Test copy constructor
     *
     */
    public void testCopyConstructor() {
        System.out.println("Test Copy constructor");
        AirAnimal instance1,instance2;
        instance1 = new AirAnimal(100,1,true,10,5);
        instance2 = new AirAnimal(instance1);
        assertTrue(instance2.getWeight() == 100);
        assertTrue(instance2.getTipe() == 1);
        assertTrue(instance2.getX() == 10);
        assertTrue(instance2.getY() == 5);
    }
    
    @Test
    /**
     * Testing setter, of class AirAnimal.
     */
    public void testSetter() {
        System.out.println("Test Setter & Getter");
        AirAnimal instance;
        instance = new AirAnimal();
        instance.setWeight(200);
        instance.setTipe(2);
        instance.setX(100);
        instance.setY(1000);
        assertTrue(instance.getWeight() == 200);
        assertTrue(instance.getTipe() == 2);
        assertTrue(instance.getX() == 100);
        assertTrue(instance.getY() == 1000);
    }
}
