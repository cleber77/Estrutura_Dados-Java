package ExeecícioJava;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Entre com o primeiro numero");
        int numero1 = scan.nextInt();
    
    
        System.out.println("Entre com o segundo numero");
        int numero2 = scan.nextInt();
    
    
        System.out.println("Entre com o tercero numero");
        int numero3 = scan.nextInt();
    
    
        System.out.println("Entre com o quarto numero");
        int numero4 = scan.nextInt();
        
        
        int media = (numero1+ numero2 + numero3 +numero4)  / 70;
        System.out.println("Sua media é "+ media);
    }
}
