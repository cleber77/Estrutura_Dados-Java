package ExeecícioJava;

import java.awt.*;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Entre com a quantidade  de metro ");
        Double metros = scan.nextDouble();
        
        double cm = metros * 100;
        System.out.println( metros +"mdeia é " +cm + " cm");
        
    }
    
}
