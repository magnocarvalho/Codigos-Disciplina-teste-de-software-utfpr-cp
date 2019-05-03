/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if66j.codigos.testeestrutural.Ex02;

/**
 *
 * @author erica
 */
public class NovaLinha {
    
    public String collapseNewlines(String argStr) {
        char last = argStr.charAt(0);
        StringBuffer sBuf = new StringBuffer();
        for (int i = 0; i < argStr.length(); i++) {
            char ch = argStr.charAt(i);
            if (ch != '\n' || last != '\n') {
                sBuf.append(ch);//adiciona no final da string o elemento 
                last = ch;
            }
        }
       
        return sBuf.toString();
    }
    
    public static void main(String[] args) {
        NovaLinha n = new NovaLinha();
        System.out.println("Saída: " + n.collapseNewlines(" \n "));
    }
}

