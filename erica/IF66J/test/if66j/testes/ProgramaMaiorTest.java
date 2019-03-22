/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.testes;

import if66j.codigos.ProgramaMaior;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erica
 */
public class ProgramaMaiorTest {
    
    ProgramaMaior m;
       
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m = new ProgramaMaior();
    }

    @After
    public void tearDown() {
    }


     @Test
     public void maiorTest1() {
      
      assertEquals(3, m.maior(3, 2)); //esperado, retornado
     }
     
       @Test
     public void maiorTest2() {
      
      assertEquals(6, m.maior(3, 6)); //esperado, retornado
     }
}
