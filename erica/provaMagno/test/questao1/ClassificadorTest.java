/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magno carvalho
 */
public class ClassificadorTest {

    public ClassificadorTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of definirFaixaEtaria method, of class Classificador.
     */
    @Test
    public void testValorIdadeInvalida() {
        Classificador classificador = new Classificador();
        Pessoa p = new Pessoa("Magno", -20);
        try {
            String res = classificador.definirFaixaEtaria(p);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("idade invalida", e.getMessage());
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void testValorIdadeInvalida2() {
        Classificador classificador = new Classificador();
        Pessoa p = new Pessoa("Magno", 120);
        String res = classificador.definirFaixaEtaria(p);
    }

    @Test
    public void testIdadeCrianca() {
        Classificador c = new Classificador();
        Pessoa p = new Pessoa("Magno", 5);
        String res = c.definirFaixaEtaria(p);
        assertEquals("Magno é crianca", res);
    }

    @Test
    public void testIdadeAdolecente() {
        Classificador c = new Classificador();
        Pessoa p = new Pessoa("Magno", 16);
        String res = c.definirFaixaEtaria(p);
        assertEquals("Magno é adolescente", res);
    }

    @Test
    public void testIdadeAdulto() {
        Classificador c = new Classificador();
        Pessoa p = new Pessoa("Magno", 24);
        String res = c.definirFaixaEtaria(p);
        assertEquals("Magno é adulto", res);
    }

    @Test
    public void testIdadeIdoso() {
        Classificador c = new Classificador();
        Pessoa p = new Pessoa("Magno", 72);
        String res = c.definirFaixaEtaria(p);
        assertEquals("Magno é idoso", res);
    }
}
