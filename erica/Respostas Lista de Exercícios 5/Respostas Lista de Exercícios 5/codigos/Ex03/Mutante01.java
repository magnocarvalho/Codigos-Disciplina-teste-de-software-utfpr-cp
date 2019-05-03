/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos.testeestrutural.Ex03;

/**
 *
 * @author erica
 */
public class Mutante01 {
    //método retorna o maior elemento do vetor
public int getMaior(int vetor[]) {
      int maior = vetor[0];
      for (int i = 1; i < vetor.length; i++) {
             if(vetor[i] != maior)
             maior = vetor[i];
}
        return maior;
   }

}
