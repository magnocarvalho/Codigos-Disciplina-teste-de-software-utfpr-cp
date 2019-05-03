package if66j.testes.testeestrutural.Ex01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import if66j.codigos.testeestrutural.Ex01.Somatoria;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomatoriaTest {
    
    //1,2,3,[4,5,6]4vezes,7,9 (Caminho percorrido no GFC)
    @Test
    public void test01() throws Exception {
        Somatoria s = new Somatoria();
        int res = s.somatoriaLimitada(-3, 7);
        assertEquals(6, res);
    }
    
    //1,2,[4,5,6]3vezes,4,5,7,8 (Caminho percorrido no GFC)
    @Test
    public void test02() throws Exception {
        
        try {
            Somatoria s = new Somatoria();
            int res = s.somatoriaLimitada(3, 1);
        } catch (Exception e) {
            assertEquals("valor maximo foi ultrapassado", e.getMessage());
        }
        
    }    
}
