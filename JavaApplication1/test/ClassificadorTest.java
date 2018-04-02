/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.Classificador;
import javaapplication1.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class ClassificadorTest {
    
    public ClassificadorTest() {
    }

    @Test
    public void testPessoaEhCrianca() {
        Pessoa p = new Pessoa("joaozinho", 8);
        
        Classificador c = new Classificador();
        String saidaReal = c.definirFaixaEtaria(p);
        
        assertEquals("joaozinho eh crianca", saidaReal);
    }
    
    @Test
    public void testPessoaEhAdolescente() {
        Pessoa p = new Pessoa("natasha", 17);
        
        Classificador c = new Classificador();
        String saidaReal = c.definirFaixaEtaria(p);
        
        assertEquals("natasha eh adolescente", saidaReal);
    }
    
    @Test
    public void testPessoaEhAdulta() {
        Pessoa p = new Pessoa("carlos", 33);
        
        Classificador c = new Classificador();
        String saidaReal = c.definirFaixaEtaria(p);
        
        assertEquals("carlos eh adulto", saidaReal);
    }
    
    @Test
    public void testPessoaComIdadeInvalida() {
        Pessoa p = new Pessoa("carlos", 200);
        
        Classificador c = new Classificador();
        try {
            c.definirFaixaEtaria(p);
            fail("nao deveria chegar aqui");
        }
        catch(IllegalArgumentException e) {
            assertEquals("idade invalida", e.getMessage());
        }
    }

    @Test(expected = Exception.class)
    public void testPessoaComIdadeInvalidaNegativa() 
            throws Exception
    {
        Pessoa p = new Pessoa("carlos", -20);
        
        Classificador c = new Classificador();
        c.definirFaixaEtaria(p);
    }
    
}
