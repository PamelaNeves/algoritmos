/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava;

import java.util.Scanner;

/**
 *
 * @author faculdade.ads
 */
public class Valores {
    
    public static void main(String[] args) {
         // declarando variaveis
        double A = 0,B = 0,C = 0, aux = 0;
        int I;
       
        
        
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite o valor de I:");
         System.out.println("1-crescente");
         System.out.println("2-decrescente");
         System.out.println("3-maior no meio");
         I = entrada.nextInt();
         
         System.out.println("Digite o valor de A:");
         A = entrada.nextFloat();
         
         System.out.println("Digite o valor de B:");
         B = entrada.nextFloat();
         
         System.out.println("Digite o valor de C:");
         C = entrada.nextFloat();
         
              
       if(A>B) { aux=A; A=B; B=aux; }
       if(B>C) { aux=B; B=C; C=aux; }
       if(A>B) { aux=A; A=B; B=aux; }
       
       switch(I){
           
           case 1:
        
               break;
           case 2:
             System.out.printf("ORDEM CRESCENTE: %.2f , %.2f,%.2f",C, B,A);
               break;
           case 3:
               System.out.printf("ORDEM CRESCENTE: %.2f , %.2f,%.2f",A, C,B);
               break;
           default:
               System.out.println("Codigo errado");
       }
   }
    
}
