/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.magneira;

/**
 *
 * @author Aluno
 */
public class Utilitario {
    
    /**
     * @param v
     * @return um objeto da classe Extremos que guarda
     * o maior nnumero no vetor e seus indices 
     */
    
    public Extremos scharExtremos(int v[]) throws Exception
    {
        if(v == null)
        {
            throw new Exception("vetor nao pode ser lido");
        }
        if(v.length == 0)
        {
            throw new Exception("vetor nao pode ser com zero elementos");
        }
        int menor = v[0], maior = v[0];
        int indiceMenor = 0, indiceMaior = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] < menor)
            {
                menor = v[i];
                indiceMenor = i;
            }
            if(v[i] > maior)
            {
                maior = v[i];
                indiceMaior = v[i];
            }
        }
        return new Extremos(menor, indiceMenor, maior, indiceMaior);
    }
}
