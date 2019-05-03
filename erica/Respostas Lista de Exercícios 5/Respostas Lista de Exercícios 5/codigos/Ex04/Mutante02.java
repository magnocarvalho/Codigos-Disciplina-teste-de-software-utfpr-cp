/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos.testeestrutural.Ex04;

/**
 *
 * @author erica
 */
public class Mutante02 {
    public int contarA(String word) {
     int contador = 0;
     for(int i = 0; i < word.length(); i++) {
             if(word.charAt(i) == 'a' || 
        word.charAt(i) == 'A')
        contador=contador+1;
         }
         return contador;
     }

}
