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
public class IMCStatus {

    private double imc;
    private String classificacao;

    public IMCStatus(double imc, String classificacao) {
        this.imc = imc;
        this.classificacao = classificacao;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }
    
}
