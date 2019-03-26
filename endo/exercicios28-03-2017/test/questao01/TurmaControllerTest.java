/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author Aluno
 */
public class TurmaControllerTest {
    
    public TurmaControllerTest() {
    }

    @Test
    public void testCodigoDisciplinaInvalido() {
        TurmaDAO turmaDaoMock = mock(TurmaDAO.class);
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina("aaa"))
                .thenReturn(Boolean.FALSE);
        
        TurmaController controller = new TurmaController(turmaDaoMock);
        controller.setVerificador(verificadorMock);
        
        Turma t = new Turma();
        t.setCodDisciplina("aaa");
        String res = controller.cadastrarTurma(t);
        assertEquals("codigo disciplina invalido", res);
    }
    
    @Test
    public void testCodigoTurmaInvalido() {
        TurmaDAO turmaDaoMock = mock(TurmaDAO.class);
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina("aaa"))
                .thenReturn(Boolean.TRUE);
        when(verificadorMock.verificarCodigoTurma("yy"))
                .thenReturn(Boolean.FALSE);
        
        TurmaController controller = new TurmaController(turmaDaoMock);
        controller.setVerificador(verificadorMock);
        
        Turma t = new Turma();
        t.setCodDisciplina("aaa");
        t.setCodTurma("yy");
        String res = controller.cadastrarTurma(t);
        assertEquals("codigo turma invalido", res);    
    }
    
    @Test
    public void testTurmaJaExiste() {
        TurmaDAO turmaDaoMock = mock(TurmaDAO.class);
        when(turmaDaoMock.existe(any()))
                .thenReturn(Boolean.TRUE);
        
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina("IF65X"))
                .thenReturn(Boolean.TRUE);
        when(verificadorMock.verificarCodigoTurma("ES61"))
                .thenReturn(Boolean.TRUE);
        
        TurmaController controller = new TurmaController(turmaDaoMock);
        controller.setVerificador(verificadorMock);
        
        Turma t = new Turma();
        t.setCodDisciplina("IF65X");
        t.setCodTurma("ES61");
        String res = controller.cadastrarTurma(t);
        assertEquals("turma ja existe", res);    
    } 
    
    @Test
    public void testTurmaSalvaComSucesso() {
        TurmaDAO turmaDaoMock = mock(TurmaDAO.class);
        when(turmaDaoMock.existe(any()))
                .thenReturn(Boolean.FALSE);
        when(turmaDaoMock.salvar(any()))
                .thenReturn(Boolean.TRUE);
        
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina("IF65X"))
                .thenReturn(Boolean.TRUE);
        when(verificadorMock.verificarCodigoTurma("ES61"))
                .thenReturn(Boolean.TRUE);
        
        TurmaController controller = new TurmaController(turmaDaoMock);
        controller.setVerificador(verificadorMock);
        
        Turma t = new Turma();
        t.setCodDisciplina("IF65X");
        t.setCodTurma("ES61");
        String res = controller.cadastrarTurma(t);
        assertEquals("turma salva com sucesso", res);    
    }     
    
    
    @Test
    public void testTurmaNaoSalvaErroBD() {
        TurmaDAO turmaDaoMock = mock(TurmaDAO.class);
        when(turmaDaoMock.existe(any()))
                .thenReturn(Boolean.FALSE);
        when(turmaDaoMock.salvar(any()))
                .thenReturn(Boolean.FALSE);
        
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina("IF65X"))
                .thenReturn(Boolean.TRUE);
        when(verificadorMock.verificarCodigoTurma("ES61"))
                .thenReturn(Boolean.TRUE);
        
        TurmaController controller = new TurmaController(turmaDaoMock);
        controller.setVerificador(verificadorMock);
        
        Turma t = new Turma();
        t.setCodDisciplina("IF65X");
        t.setCodTurma("ES61");
        String res = controller.cadastrarTurma(t);
        assertEquals("turma nao salva. Erro no BD", res);    
    }    
}
