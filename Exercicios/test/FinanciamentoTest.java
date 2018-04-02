/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class FinanciamentoTest {
    
    public FinanciamentoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testClienteMenosDe1000() {
        Cliente c = new Cliente();
        c.setNome("Joao da Silva");
        c.setSalario(500.00);
        c.setIdade(20);
        c.setValorEmprestimo(800.00);
        
        AgenteFinanciamento af = new AgenteFinanciamento();
        ArrayList<Proposta> propostas = af.calcularPropostas(c);
        assertEquals(2, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(1600.00, p1.getTotal(), 0.0001);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800.00, p1.getValorDaParcela(), 0.0001);
        
        Proposta p2 = propostas.get(1);
        assertEquals(1600.00, p2.getTotal(), 0.0001);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33, p2.getValorDaParcela(), 0.0001);
        
    }
}
