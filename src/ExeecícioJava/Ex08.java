package ExeecícioJava;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Qual é sua horas trabalhada ");
          double valorhoras = scan.nextDouble();
      
          System.out.println("Entre com as horas trabalhada ");
          double horas = scan.nextDouble();
          
          double salario = valorhoras * horas;
          
          System.out.println("O salario é de " + salario);
          
    }
}
