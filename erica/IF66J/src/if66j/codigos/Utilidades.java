/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos;

/**
 *
 * @author erica
 */
public class Utilidades {
    
    /**
	 * Método retorna a soma todos os números que estão no vetor
	 * @param vet
	 * @return total
	 */
	public int somar(int[] vet){
		
		int total = 0;
		
		for (int i=0; i<vet.length; i++){
			total += vet[i];
		}
		
		return total;
	}
	
	
	/**
	 * Método retorna a multiplicação todos os números que estão no vetor
	 * @param vet
	 * @return total
	 */
	public int multiplicar(int[] vet){
		
		int total = 1;
		
		for (int i=0; i<vet.length; i++){
			total *= vet[i];
		}
		
		return total;
	}
	
	
	public String compararTexto(){
		
		String texto = "Engenharia de Software";
		
		return texto;
	}
	
}
