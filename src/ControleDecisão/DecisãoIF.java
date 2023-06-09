package ControleDecisão;

import java.util.Scanner;

public class DecisãoIF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        
        if (idade >= 46){
            System.out.println("sua idade esta correta");
        }else {
            System.out.println("nao e sua iadade46");
        }*/
        
        
        //  barato <= 10 esta barato pode compre
        //  10< valor <15 - pedir  descconta
        //  >=17 -muito caro
    
    
        System.out.println("Entr com o preço ");
        double valor  = scan.nextDouble();
        
          if ( valor <= 10){
              System.out.println("Esta barato pode compra");
          }else if (valor < 10 && valor <15){
          System.out.println("pode pedir um  desconto");
          
          } else if ( valor >= 15 && valor < 17) {
              System.out.println("Pode pesquisar mais");
              
          } else {// 17 valor
              System.out.println("Muito  caro ");
          }
    
    
    }
}
