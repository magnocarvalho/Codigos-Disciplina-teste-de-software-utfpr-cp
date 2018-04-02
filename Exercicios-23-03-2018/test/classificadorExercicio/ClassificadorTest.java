package classificadorExercicio;

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
    public void testValorIdadeInvalida() {
        Classificador classificador = new Classificador();
        Pessoa p = new Pessoa("Raniel", -20);
        try{
            String res = classificador.definirFaixaEtaria(p);
            fail();
        }
        catch(Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals("idade invalida", e.getMessage());
        }
        
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValorIdadeInvalida2(){
        Classificador classificador = new Classificador();
        Pessoa p = new Pessoa("Raniel", -20);
        String res = classificador.definirFaixaEtaria(p);
    }
    
    @Test
    public void testIdadeCrianca(){
        Classificador c = new Classificador();
        Pessoa p = new Pessoa("Lucas", 5);
        String res = c.definirFaixaEtaria(p);
        assertEquals("Lucas eh crianca", res);
    }
}
