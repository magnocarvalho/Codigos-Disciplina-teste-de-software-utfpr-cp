/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author magno
 */
public class Pessoa {
    
    private String nome;
    private double peso;
    private double altura;
    public Pessoa(String n, double p, double a)
    {
        this.nome = n;
        this.peso = p;
        this.altura = a;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }
    
}
