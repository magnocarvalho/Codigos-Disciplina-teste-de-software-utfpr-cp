/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutantes;

/**
 *
 * @author Aluno
 */
public class Original {

    public float pow(int x, int y) {
        int pow;
        if (y >= 0) {
            pow = y;
        } else {
            pow = -y;
        }

        float res = 1;
        while (pow > 0) {
            res = res * x;
            pow--;
        }

        if (y < 0) {
            res = 1 / res;
        }

        return res;
    }
}
