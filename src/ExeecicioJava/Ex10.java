package ExeecicioJava;

import java.util.Scanner;

public class Ex10 {
    Scanner scan = new Scanner(System.in);{
        
        System.out.println("Qual é e temperatura em Celsus");
    
        double c = scan.nextDouble();
    
        double  f = c * 1.8 + 32;
         
         System.out.println("A temperatura " + f+ " farenheit" + c + " c");
     }

 }

