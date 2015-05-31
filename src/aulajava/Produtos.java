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
public class Produtos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int p;
        double peso, preco, pesoTotal = 0,precoTotal = 0,imposto = 0;
        System.out.println("Informe o código do País:");
        System.out.println("País 1, cód produto 1 a 4");
         System.out.println("País 2, cód produto 5 a 7");
          System.out.println("País 3, cód produto 8 a 10");
          p=entrada.nextInt();
          System.out.println("Informe o peso e o preco do produto");
          peso=entrada.nextDouble();
          preco=entrada.nextDouble();
          switch(p){
              case 1:
                  pesoTotal=peso/1000;
                  precoTotal=10*pesoTotal;
                  imposto=precoTotal;
                  break;
              case 2:
                  pesoTotal=peso/1000;
                  precoTotal=25*pesoTotal;
                  imposto=(precoTotal*0.15);
                  break; 
              case 3:
                  pesoTotal=peso/1000;
                  precoTotal=35*pesoTotal;
                  imposto=precoTotal*0.25;
                  break;
              default:
                  System.out.println("Código inválido");
          }
          System.out.println("O peso total do produto convertido em gramas é: "+pesoTotal);
          System.out.println("O preço total do produto comprado é: R$ "+precoTotal);
          System.out.println("O valor do imposto sobre o produto é: R$ "+imposto);
          System.out.println("O preço + imposto é: R$ "+precoTotal+imposto);
          
    }
    
    
}
