package if66j.testes.testeestrutural.Ex03;

import if66j.codigos.testeestrutural.Ex03.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erica
 */
public class MatandoMutantesTest {
    
    @Test
    public void mutante1() {
        Original o = new Original();
        int[] v = {2, 1};
        assertEquals(2, o.getMaior(v));
        
        Mutante01 m1 = new Mutante01(); 
        assertEquals(2, m1.getMaior(v));
    }
    
    @Test
    public void mutante2() {
        Original o = new Original();
        int[] v = {1, 3, 2};
        assertEquals(3, o.getMaior(v));
        
        Mutante02 m2 = new Mutante02();
        assertEquals(3, m2.getMaior(v));
    }
    
    //@Test
    public void mutante3() {
        //equivalente pq no original ele faz um teste a menos
        //começando da 2ª posicao
    }
}