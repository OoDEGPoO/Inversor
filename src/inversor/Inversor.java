/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversor;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Inversor {

    /**
     * @param args the command line arguments
     */
    public static int inversor(int x){
        return auxInversor(x, 0);
    }
    
    private static int auxInversor(int x, int e) {
        int c, r, out = 0;
        c = x/10;
        r = x % 10;
        
        if (c==0) out = e*10+r;
        else out = auxInversor(c, (e*10+r));
        
        return out;
    }
    
    public static void main(String[] args) {
        int x = 0;
        
        if (args.length > 0) x = Integer.parseInt(args[0]);
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Introduce un numero entero válido:\n");
            x = in.nextInt();
        }
        
        System.out.println("inverso de " + x + " es " + inversor(x));
    }
    
}
