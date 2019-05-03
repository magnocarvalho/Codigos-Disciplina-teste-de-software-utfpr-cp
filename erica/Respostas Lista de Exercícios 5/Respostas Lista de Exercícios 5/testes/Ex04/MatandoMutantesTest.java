package if66j.testes.testeestrutural.Ex04;

import if66j.codigos.testeestrutural.Ex04.*;
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
      int ret = o.contarA("EricA Souza");
      assertEquals(2, ret);
      
      Mutante01 m1= new Mutante01();
      int retm1 = m1.contarA("EricA Souza");
      assertEquals(2, retm1);
      
    }
    
    @Test
    public void mutante2() {
        
      Original o = new Original();
      int ret = o.contarA("EricA Souza");
      assertEquals(2, ret);
      
      Mutante02 m2= new Mutante02();
      int retm2 = m2.contarA("EricA Souza");
      assertEquals(2, retm2);       
    }
    
    @Test
    public void mutante3() {
     Original o = new Original();
     int ret = o.contarA("EricA Souza");
     assertEquals(2, ret);
      
      Mutante03 m3= new Mutante03();
      int retm3 = m3.contarA("EricA Souza");
      assertEquals(2, retm3);
      
    }

}