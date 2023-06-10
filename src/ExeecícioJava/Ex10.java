package ExeecícioJava;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entra com a temperatura Celsius");
        
        double c = scan.nextDouble();
        
        double f = c * 1.8 + 32;
        
        System.out.println("A tempratura " + c+ "C é o iqual "+ f + " f");
        
    }
}
