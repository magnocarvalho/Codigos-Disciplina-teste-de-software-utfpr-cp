/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.testes.testeestrutural;

import if66j.codigos.testeestrutural.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author erica
 */
public class BubbleSortTest {
    
    BubbleSort bs;
    
    
    @Before
    public void setUp() {
        bs = new BubbleSort();
    }
    
    //@Test
    public void testVetorOrdenadoTodosArcos() {  
         int vetor1[] = {2,3,1};
         int vetorOrdenado [] = bs.bolha(vetor1,3);
         int vetorEsperado [] =  {1,2,3};
         Assert.assertArrayEquals(vetorEsperado, vetorOrdenado);   
    }
      
    
    //Teste com vetor já ordenado
    @Test
    public void testVetorOrdenadoArcos5_7() {  
         int vetor1[] = {1,2,3};
         int vetorOrdenado [] = bs.bolha(vetor1,3);
         int vetorEsperado [] =  {1,2,3};
         Assert.assertArrayEquals(vetorEsperado, vetorOrdenado);   
    }
}
