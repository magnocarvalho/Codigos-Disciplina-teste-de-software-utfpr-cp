/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos.testeestrutural;

/**
 *
 * @author erica
 */
public class BubbleSort {
    
    public int[] bolha (int[] a, int size){
        int i, j, aux ;
        for (i = 0; i < size ; i ++) {
            for ( j = size - 1; j > i ; j--) {
            if( a [ j - 1] > a [ j ] ) {
                aux = a [ j - 1 ];
                a [ j - 1] = a [ j ] ;
                a [ j ] = aux ;
            }
        }
     }
        return a;
  }//exit
}

