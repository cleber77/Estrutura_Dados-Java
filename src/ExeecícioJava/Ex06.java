package ExeecícioJava;

import java.util.Map;
import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Qual e  raio de u, circulo");
        double raio = scan .nextDouble();
        
        double area = Math.PI * Math.pow( raio,2);
        System.out.println("A área do círculo  é "  + area);
        
        
    }
}
