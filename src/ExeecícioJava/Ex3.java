package ExeecícioJava;
//3. Faça um Programa que peça dois números e imprima a soma


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero");
        int numero1 = scan.nextInt();
        
        System.out.println("Entre com o Segundo Numero");
        int  numero2 = scan.nextInt();
        
        int Resultado = numero1 + numero2;
        System.out.println("Os doi mu são "  + Resultado);
        
        
    }
}
