/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magno
 */
public class IMCCalculadoraTest {

    public IMCCalculadoraTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of Calcular method, of class IMCCalculadora.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPesoAlturaInvalido1() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", -75, -2);
        IMCStatus res = classificador.Calcular(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPesoAlturaInvalido2() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", 75, -2);
        IMCStatus res = classificador.Calcular(p);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPesoAlturaInvalido3() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", -75, 2);
        IMCStatus res = classificador.Calcular(p);
    }

    @Test
    public void testPesoAbaixo() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", 35, 1.75);
        IMCStatus imc = classificador.Calcular(p);
        assertEquals("abaixo do peso", imc.getClassificacao());
    }

    @Test
    public void testPesoNormal() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", 70, 1.75);
        IMCStatus imc = classificador.Calcular(p);
        assertEquals("normal", imc.getClassificacao());
    }

    @Test
    public void testPesoAcima() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", 85, 1.75);
        IMCStatus imc = classificador.Calcular(p);
        assertEquals("acima do peso", imc.getClassificacao());
    }

    @Test
    public void testPesoObeso() {
        IMCCalculadora classificador = new IMCCalculadora();
        Pessoa p = new Pessoa("Magno", 130, 1.75);
        IMCStatus imc = classificador.Calcular(p);
        assertEquals("obeso", imc.getClassificacao());
    }

}
