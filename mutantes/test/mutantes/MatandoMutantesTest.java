package mutantes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class MatandoMutantesTest {

    @Test
    public void matarMutante01() {
        Original o = new Original();
        
        assertEquals(1.0, o.pow(3, 0), 0.0001);
        
        Mutante1 m1 = new Mutante1();
        assertEquals(1.0, m1.pow(3, 0), 0.0001);
        
        //mutante equivalente
    }
    
    @Test(timeout = 2000)
    public void matarMutante02() {
        Original o = new Original();
        
        assertEquals(3.0, o.pow(3, 1), 0.0001);
        
        Mutante2 m2 = new Mutante2();
        assertEquals(3.0, m2.pow(3, 1), 0.0001);
        //mutante morto
    }    

    @Test(timeout = 2000)
    public void matarMutante03() {
        Original o = new Original();
        
        assertEquals(3.0, o.pow(3, 1), 0.0001);
        
        //mutante equivalente
        
        Mutante3 m3 = new Mutante3();
        assertEquals(3.0, m3.pow(3, 1), 0.0001);
        
    }    
    
    @Test
    public void matarMutante04() {
        Original o = new Original();
        
        assertEquals(27.0, o.pow(3, 3), 0.0001);
        
        //mutante morto
        
        Mutante4 m4 = new Mutante4();
        assertEquals(27.0, m4.pow(3, 3), 0.0001);
    }    
}
