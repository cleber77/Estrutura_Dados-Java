package ExeecícioJava;

//Faça um Programa que peça um número e então mostre a
  //      mensagem O número informado foi [número].


import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("Entre com o numero  ");
        int numero = scan.nextInt();
         System.out.println("seu numero é " +numero);
        
    }
}
