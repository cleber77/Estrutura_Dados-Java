package OperadoreLogico;

import java.util.Scanner;

public class ComandoSwitch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o dia da semana ");
        
        int DiadaSemana = scan.nextInt();
        
        
        if (DiadaSemana == 1) {
            System.out.println("Domingo");
        } else if (DiadaSemana == 2) {
            System.out.println("Segunda");
    
        } else if (DiadaSemana == 3) {
            System.out.println("Terça");
    
        } else if (DiadaSemana == 4) {
            System.out.println("Quarta");
    
        } else if (DiadaSemana == 5) {
            System.out.println("Quinta");
    
        } else if (DiadaSemana == 6) {
            System.out.println("Sexta");
    
        } else if (DiadaSemana == 7) {
            System.out.println("Sabado");
    }
        switch (DiadaSemana){
            case 1: System.out.print("Domingo");
            case 2: System.out.print("segunda");
            case 3: System.out.print("Terça");
            case 4: System.out.print("Quarta");
            case 5: System.out.print("Quinta");
            case 6: System.out.print("Sexta");
            case 7: System.out.print("Sabado");break;
            default:System.out.print("Não e o dia da semana");
        }
    }

 }

