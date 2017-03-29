/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiuPutih;

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
public class HiuPutihTest {
    
    public HiuPutihTest() {
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
     * Testing Default parameter, of class HiuPutih.
     */
    public void testDefault() {
        System.out.println("Test Default Parameter");
        HiuPutih instance;
        instance = new HiuPutih ();
        assertTrue(instance.animal.getWeight() == 0);
        assertTrue(instance.animal.getTipe() == 0);
        assertTrue(instance.animal.getX() == 0);
        assertTrue(instance.animal.getY() == 0);
    }

    @Test
    /**
     * Testing parameter, of class HiuPutih.
     */
    public void testParameter() {
        System.out.println("Test Parameter");
        HiuPutih instance;
        instance = new HiuPutih(100,1,10,5);
        assertTrue(instance.animal.getWeight() == 100);
        assertTrue(instance.animal.getTipe() == 1);
        assertTrue(instance.animal.getX() == 10);
        assertTrue(instance.animal.getY() == 5);
    }
    
    @Test
    /**
     * Test copy constructor
     *
     */
    public void testCopyConstructor() {
        System.out.println("Test Copy constructor");
        HiuPutih instance1,instance2;
        instance1 = new HiuPutih(100,1,10,5);
        instance2 = new HiuPutih(instance1);
        assertTrue(instance2.animal.getWeight() == 100);
        assertTrue(instance2.animal.getTipe() == 1);
        assertTrue(instance2.animal.getX() == 10);
        assertTrue(instance2.animal.getY() == 5);
    }
    
    @Test
    /**
     * Testing setter, of class HiuPutih.
     */
    public void testSetter() {
        System.out.println("Test Setter & Getter");
        HiuPutih instance;
        instance = new HiuPutih();
        instance.animal.setWeight(200);
        instance.animal.setTipe(2);
        instance.animal.setX(100);
        instance.animal.setY(1000);
        assertTrue(instance.animal.getWeight() == 200);
        assertTrue(instance.animal.getTipe() == 2);
        assertTrue(instance.animal.getX() == 100);
        assertTrue(instance.animal.getY() == 1000);
    }
    
    @Test
    /**
     * Testing render, of class HiuPutih.
     */
    public void testRender() {
        System.out.println("Test Render");
        HiuPutih instance;
        instance = new HiuPutih();
        instance.render();
    }
}
