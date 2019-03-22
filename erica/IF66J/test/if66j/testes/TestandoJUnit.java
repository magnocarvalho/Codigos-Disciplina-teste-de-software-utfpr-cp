/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.testes;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


/**
 *
 * @author erica
 */
public class TestandoJUnit {
    
    ArrayList<String> list;
    
    public TestandoJUnit() {
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

    @Ignore
     @Test
     public void teste01() { 
         list = new ArrayList<>();
         list.add("A");
         list.add("B");
         list.add("c"); 
        
         
         //assertEquals(esperado, retornado);
         assertEquals(3, list.size());
         assertEquals(false, list.isEmpty());
         assertEquals(true, list.contains("A"));
         assertEquals("A", list.get(1));
         
     }
     
     @Test
     public void teste02() { 
          
     }
     
     @Test
     public void teste03() { 
          
     }
     
     @Test
     public void teste04() { 
              
     }
}
