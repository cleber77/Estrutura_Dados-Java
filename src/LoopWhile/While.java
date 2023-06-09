package LoopWhile;


import java.awt.*;

public class While {
    
    public static void main(String[] args) {
        
        int cont = 1; // pode usa r count ou cont
        
        int max = 20;
        
        System.out.print(" contqando de UMA A DEZ" + max);
        
        while (cont < max) {
            System.out.println(" Valoe de um a dez " + cont);
            cont++;
        }
        System.out.println(cont);// valor d 11
        do {
            cont++;
            System.out.println("valor de i:" + cont);
        }while ( cont <103);
         System.out.println(cont);
    }
}
