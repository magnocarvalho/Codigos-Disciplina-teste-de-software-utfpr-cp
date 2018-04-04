/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.utfpr.magneira.Extremos;
import br.edu.utfpr.magneira.Utilitario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TestAcharExtremos {
    
  
    
    public TestAcharExtremos() {
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
    public void casoTestQuestao1() throws Exception
    {
        int v[] = {1,2,3,4,5,6};
        Utilitario a = new Utilitario();
        Extremos res;
       
        res = a.acharExtremos(v);
        assertEquals(1,res.getMenor());
        assertEquals(0,res.getIndiceMenor());
        assertEquals(6,res.getMaior());
        assertEquals(5,res.getIndiceMaior());
        
    }
    @Test 
    public void casoDeTest02() throws Exception
    {
        int v[] = {1, 99, 3, -5, 8};
        Utilitario a = new Utilitario();
        Extremos res;
       
        res = a.acharExtremos(v);
        assertEquals(-5, res.getMenor());
        assertEquals(3,res.getIndiceMenor());
        assertEquals(99,res.getMaior());
        assertEquals(1,res.getIndiceMaior());
    }
    public void casoDeTest03() throws Exception
    {
        int v[]= {};
        Utilitario a = new Utilitario();
        Extremos res;
       
        res = a.acharExtremos(v);
        assertNotNull("objeto nulo", res);
    }
    
}
