package LoopWhile;

import java.util.Scanner;

public class breack_continue {
    
    public static void main(String[] args) {
        Scanner sac = new  Scanner(System.in);
        System.out.println("Entre como um numeo ");
        
       int numero = sac.nextInt();
       
       System.out.println("Entra com o limite do numero");
       int  max = sac.nextInt();
       
       for (int  i  = numero; i>=max; i++){
            if ( i % 7 == 0){
                System.out.println("O valoer da é :" + i);
                break;
            }
       }
       
    }
}
