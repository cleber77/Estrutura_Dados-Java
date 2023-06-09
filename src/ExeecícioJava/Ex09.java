package ExeecícioJava;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual é e temperatura em graus");
         double farenheit = scan.nextDouble();
          double  c = (5 * (farenheit-32) / 9);
         
         System.out.println("A temperatura " + farenheit+ " farenheit" + c + " c");
    }
}
