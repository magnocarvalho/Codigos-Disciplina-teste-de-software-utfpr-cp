/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author magno
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

}
