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
public class Extremos {

    int menor, maior, indiceMaior, indiceMenor;

    public Extremos(int menor, int indiceMenor, int maior, int indiceMaior) {
        this.menor = menor;
        this.maior = maior;
        this.indiceMaior = indiceMaior;
        this.indiceMenor = indiceMenor;
    }

    public int getMenor() {
        return menor;
    }

    public int getMaior() {
        return maior;
    }

    public int getIndiceMaior() {
        return indiceMaior;
    }

    public int getIndiceMenor() {
        return indiceMenor;
    }
    
   
    
}
