/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedesoftware;

/**
 *
 * @author magno
 */
public class TesteDeSoftware {

    /**
     * @param args the command line arguments
     */
    /**
     * M�todo retorna a soma todos os n�meros que est�o no vetor
     *
     * @param vet
     * @return total
     */
    public int somar(int[] vet) {

        int total = 0;

        for (int i = 0; i < vet.length; i++) {
            total += vet[i];
        }

        return total;
    }

    /**
     * M�todo retorna a multiplica��o todos os n�meros que est�o no vetor
     *
     * @param vet
     * @return total
     */
    public int multiplicar(int[] vet) {

        int total = 1;

        for (int i = 0; i < vet.length; i++) {
            total *= vet[i];
        }

        return total;
    }

    public String compararTexto() {

        String texto = "Engenharia de Software";

        return texto;
    }
}
