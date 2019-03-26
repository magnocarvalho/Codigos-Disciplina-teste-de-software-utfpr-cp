/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import exercicio02.Automovel;
import exercicio02.AutomovelDAO;
import exercicio02.Cancela;
import exercicio02.Display;
import exercicio02.PortaoController;
import exercicio02.RegistroEntradaDao;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 *
 * @author Aluno
 */
public class PortaoControllerTest {
    
    Display displayMock; 
    AutomovelDAO autoDaoMock;
    Cancela cancelaMock;
    RegistroEntradaDao regentDaoMock;
    PortaoController controller;
    
    public PortaoControllerTest() {
    }
    
    @Before
    public void before() {
        displayMock = mock(Display.class);
        autoDaoMock = mock(AutomovelDAO.class);
        cancelaMock = mock(Cancela.class);
        regentDaoMock = mock(RegistroEntradaDao.class);
        
        controller = new PortaoController();
        controller.setDisplay(displayMock);
        controller.setAutomovelDao(autoDaoMock);
        controller.setCancela(cancelaMock);
        controller.setRegistroEntradaDao(regentDaoMock);        
    }
    
    @Test
    public void testCarroSemTag() {
        assertFalse( controller.abrir("ERRO") );
        
        verify(displayMock)
                .limpar();
        verify(displayMock)
                .mostrarMsg("Automovel nao possui TAG. Por favor, voltar!");
    }
    
    @Test
    public void testCarroComTagSemCadastroNoBD() {
        when( autoDaoMock.getByTag("xyz1234") )
                .thenReturn( null );
        
        assertFalse( controller.abrir("xyz1234") );
        
        verify(displayMock)
                .limpar();
        verify(displayMock)
                .mostrarMsg("TAG desconhecida. Por favor, voltar!");
    }

    @Test
    public void testCarroComTagComCadastroNoBD() {
        Automovel auto = new Automovel();
        auto.setTag("tag45utfpr");
        auto.setProprietario("Mario Bros");
        auto.setPlaca("ABC-1234");
        when( autoDaoMock.getByTag("tag45utfpr") )
                .thenReturn(auto);
        
        assertTrue( controller.abrir("tag45utfpr") );
        
        verify(displayMock)
                .limpar();
        verify(cancelaMock)
                .levantar();
        verify(displayMock)
                .mostrarMsg("Bem-Vindo, Mario Bros!");
        verify(regentDaoMock)
                .registrarEntradaAgora(anyString(), anyString());
    }
    
}
