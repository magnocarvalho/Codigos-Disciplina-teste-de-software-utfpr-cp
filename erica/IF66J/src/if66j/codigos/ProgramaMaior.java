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
public class ProgramaMaior {
    
int A;
int B;

public int maior (int A, int B){
    
    if (A > B){
        System.out.println("O maior é:" + A);
        return A;
    } else {
        System.out.println("O maior é:" + B);
        return B;
    }
}
    public static void main(String[] args) {
        
        ProgramaMaior t = new ProgramaMaior();
        t.maior(-1,0);
    }
    
}
