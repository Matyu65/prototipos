/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLS_class;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matyu
 */
public class cls_operacionesTest {
    
    public cls_operacionesTest() {
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

    /**
     * Test of hipotenusa method, of class cls_operaciones.
     */
    @Test
    public void testHipotenusa() {
        System.out.println("hipotenusa");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 5;
        double result = instance.hipotenusa();
        assertEquals(expResult, result, 5);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resistencia_paralelo method, of class cls_operaciones.
     */
    @Test
    public void testResistencia_paralelo() {
        System.out.println("resistencia_paralelo");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 30;
        double result = instance.resistencia_paralelo();
        assertEquals(expResult, result, 30);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of intensidad method, of class cls_operaciones.
     */
    @Test
    public void testIntensidad() {
        System.out.println("intensidad");
        cls_operaciones instance = new cls_operaciones();
        double expResult =1.0;
        double result = instance.intensidad();
        assertEquals(expResult, result,1.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getLadoA method, of class cls_operaciones.
     */
    @Test
    public void testGetLadoA() {
        System.out.println("getLadoA");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 3;
        double result = instance.getLadoA();
        assertEquals(expResult, result, 3);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setLadoA method, of class cls_operaciones.
     */
    @Test
    public void testSetLadoA() {
        System.out.println("setLadoA");
        double ladoA = 3;
        cls_operaciones instance = new cls_operaciones();
        instance.setLadoA(ladoA);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLadoB method, of class cls_operaciones.
     */
    @Test
    public void testGetLadoB() {
        System.out.println("getLadoB");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 4;
        double result = instance.getLadoB();
        assertEquals(expResult, result, 4);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setLadoB method, of class cls_operaciones.
     */
    @Test
    public void testSetLadoB() {
        System.out.println("setLadoB");
        double ladoB = 4;
        cls_operaciones instance = new cls_operaciones();
        instance.setLadoB(ladoB);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResis1 method, of class cls_operaciones.
     */
    @Test
    public void testGetResis1() {
        System.out.println("getResis1");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 10;
        double result = instance.getResis1();
        assertEquals(expResult, result, 10);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setResis1 method, of class cls_operaciones.
     */
    @Test
    public void testSetResis1() {
        System.out.println("setResis1");
        double resis1 = 10;
        cls_operaciones instance = new cls_operaciones();
        instance.setResis1(resis1);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResis2 method, of class cls_operaciones.
     */
    @Test
    public void testGetResis2() {
        System.out.println("getResis2");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 10;
        double result = instance.getResis2();
        assertEquals(expResult, result, 10);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setResis2 method, of class cls_operaciones.
     */
    @Test
    public void testSetResis2() {
        System.out.println("setResis2");
        double resis2 = 10;
        cls_operaciones instance = new cls_operaciones();
        instance.setResis2(resis2);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResis3 method, of class cls_operaciones.
     */
    @Test
    public void testGetResis3() {
        System.out.println("getResis3");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 10;
        double result = instance.getResis3();
        assertEquals(expResult, result,10);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setResis3 method, of class cls_operaciones.
     */
    @Test
    public void testSetResis3() {
        System.out.println("setResis3");
        double resis3 = 10;
        cls_operaciones instance = new cls_operaciones();
        instance.setResis3(resis3);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getVoltaje method, of class cls_operaciones.
     */
    @Test
    public void testGetVoltaje() {
        System.out.println("getVoltaje");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 30;
        double result = instance.getVoltaje();
        assertEquals(expResult, result, 30);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setVoltaje method, of class cls_operaciones.
     */
    @Test
    public void testSetVoltaje()
    {
        System.out.println("setVoltaje");
        double voltaje = 30;
        cls_operaciones instance = new cls_operaciones();
        instance.setVoltaje(voltaje);
      
    }

    /**
     * Test of getResistotal method, of class cls_operaciones.
     */
    @Test
    public void testGetResistotal() {
        System.out.println("getResistotal");
        cls_operaciones instance = new cls_operaciones();
        double expResult = 30;
        double result = instance.getResistotal();
        assertEquals(expResult, result, 30);
        
    }

    /**
     * Test of setResistotal method, of class cls_operaciones.
     */
    @Test
    public void testSetResistotal() {
        System.out.println("setResistotal");
        double resistotal = 30;
        cls_operaciones instance = new cls_operaciones();
        instance.setResistotal(resistotal);
        
    }
    
}
