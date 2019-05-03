/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.testes.testeestrutural.Ex02;

import org.junit.Test;
import static org.junit.Assert.*;
import if66j.codigos.testeestrutural.Ex02.NovaLinha;
import org.junit.Before;

/**
 *
 * @author erica
 */
public class NovaLinhaTest {

    NovaLinha nl;

    @Before
    public void setUp() {
        nl = new NovaLinha();
    }
    
    @Test
    public void testCobreArco3_9() {  
        String ret = nl.collapseNewlines(" \n \n \n ");//sempre que passar \n ele vai retornar um espaço
        System.out.println("" + ret);
        assertEquals(" \n \n \n ", ret);
    }
    
    //Caminho executado: 1,2,3,5,6,8,4,3,9
    @Test
    public void testCobreArco3_9_() {
        String ret = nl.collapseNewlines("a");
        assertEquals("a", ret);
    }
    
    //1,2,3,5,6,7,4,3,9 
    @Test
    public void testCobreArco6_7() {
        String ret = nl.collapseNewlines("\n");
        assertEquals("", ret);
    }
    
    //1,2,3,5,6,8,4,3,5,6,7,8,4,3,5,6,8,4,3,9
    @Test
    public void testCobreArco7_8() {
        String ret = nl.collapseNewlines("a\nb");
        assertEquals("a\nb", ret);
    } 
    
    @Test
    public void testOQueFaz() {
        String ret = nl.collapseNewlines("a\n\nb");
        System.out.println("a\n\nb");
        System.out.println(ret);
        assertEquals("a\nb", ret);
    }   
}
