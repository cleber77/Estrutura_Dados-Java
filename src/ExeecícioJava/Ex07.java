package ExeecícioJava;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner( System.in);
        
        System.out.println("Entre com o lado do quadrado");
        double lado = scan.nextDouble();
        
        //  area  = lado * lado
        double area = Math.pow( lado,2);
        
        
        System.out.println("A  área do quadro  é "  + area);
        System.out.println("O drobro da área do quadrado  "  + (area * 2));
    }
}
