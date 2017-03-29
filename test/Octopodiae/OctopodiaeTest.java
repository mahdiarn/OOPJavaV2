/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Octopodiae;

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
public class OctopodiaeTest {
    
    public OctopodiaeTest() {
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
     * Testing Default parameter, of class Octopodiae.
     */
    public void testDefault() {
        System.out.println("Test Default Parameter");
        Octopodiae instance;
        instance = new Octopodiae ();
        assertTrue(instance.getWeight() == 0);
        assertTrue(instance.getTipe() == 0);
        assertTrue(instance.getX() == -1);
        assertTrue(instance.getY() == -1);
    }

    @Test
    /**
     * Testing parameter, of class Octopodiae.
     */
    public void testParameter() {
        System.out.println("Test Parameter");
        Octopodiae instance;
        instance = new Octopodiae(100,1,true,10,5);
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
        Octopodiae instance1,instance2;
        instance1 = new Octopodiae(100,1,true,10,5);
        instance2 = new Octopodiae(instance1);
        assertTrue(instance2.getWeight() == 100);
        assertTrue(instance2.getTipe() == 1);
        assertTrue(instance2.getX() == 10);
        assertTrue(instance2.getY() == 5);
    }
    
    @Test
    /**
     * Testing setter, of class Octopodiae.
     */
    public void testSetter() {
        System.out.println("Test Setter & Getter");
        Octopodiae instance;
        instance = new Octopodiae();
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
