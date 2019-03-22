/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos;

/**
 *
 * @author Aluno
 */
public class Triangulo {
       

    public String qualTriangulo(int a, int b, int c) {
        if(isValido(a, b, c)) {
        } else {
            return "erro";
        }
        
        if(a == b && b == c)
            return "equilatero";

        if(a == b || b == c || a == c)
            return "isosceles";

        return "escaleno";
    }

    private boolean isValido(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0)
            return false;
        
        return (a+b) > c && (a+c) > b && (b+c) > a;
    }    
    
}
