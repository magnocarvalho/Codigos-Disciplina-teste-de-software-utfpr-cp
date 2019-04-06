/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedesoftware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magno
 */
public class TesteDeSoftwareTest {
    
    public TesteDeSoftwareTest() {
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
     * Test of somar method, of class TesteDeSoftware.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        int[] vet = null;
        TesteDeSoftware instance = new TesteDeSoftware();
        int expResult = 0;
        int result = instance.somar(vet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class TesteDeSoftware.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int[] vet = null;
        TesteDeSoftware instance = new TesteDeSoftware();
        int expResult = 0;
        int result = instance.multiplicar(vet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compararTexto method, of class TesteDeSoftware.
     */
    @Test
    public void testCompararTexto() {
        System.out.println("compararTexto");
        TesteDeSoftware instance = new TesteDeSoftware();
        String expResult = "";
        String result = instance.compararTexto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
