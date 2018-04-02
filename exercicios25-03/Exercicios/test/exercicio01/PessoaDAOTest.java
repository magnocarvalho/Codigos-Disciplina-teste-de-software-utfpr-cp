/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 *
 * @author Aluno
 */
public class PessoaDAOTest {
    
    RHService rhservMock;
    PessoaDAO dao;
    
    public PessoaDAOTest() {
    }
    
    @Before
    public void before() {
        rhservMock = mock(RHService.class);
        //configurar mock
        Pessoa p1 = new Pessoa(1, "Maria Silva", 23);
        Pessoa p2 = new Pessoa(2, "Mario Bros", 45);
        Pessoa p3 = new Pessoa(3, "Joana D'Arc", 19);
        ArrayList<Pessoa> pessoasRet = new ArrayList<>();
        pessoasRet.add(p1);
        pessoasRet.add(p2);
        pessoasRet.add(p3);
        when(rhservMock.getAllPessoas())
                .thenReturn(pessoasRet);
        
        dao = new PessoaDAO(rhservMock);    
    }
    
    @Test
    public void testPessoaExiste() {
        assertTrue( dao.existePessoa("Mario Bros") );
    }

    @Test
    public void testPessoaNaoExiste() {
        assertFalse( dao.existePessoa("Jon Snow") );        
    }


}
