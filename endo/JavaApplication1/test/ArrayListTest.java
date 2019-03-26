/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author Aluno
 */
public class ArrayListTest {
    
    ArrayList<String> list;
    
    public ArrayListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSize() {
        assertEquals(4, list.size());
    }
    
    @Test
    public void testIndexOf() {
        assertEquals(3, list.indexOf("d"));
        assertEquals(2, list.indexOf("c"));
        assertEquals(1, list.indexOf("b"));
        assertEquals(0, list.indexOf("a"));
    }
    
    @Ignore
    @Test
    public void testContains() {
        assertTrue( list.contains("b") );
        assertFalse( list.contains("e") );
    }
    
    @Test(timeout = 2000)
    public void testInfinito() {
        while(true) {
        }
    }
    
}
