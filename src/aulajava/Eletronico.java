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
public class Eletronico {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int conta, op;
        double saldo, valor, deb, cred;
        
        System.out.println("Informe o número de sua conta");
        conta=entrada.nextInt();
        System.out.println("Informe seu saldo:");
        saldo=entrada.nextDouble();
        System.out.println("Informe um valor");
        valor=entrada.nextDouble();
        System.out.println("Digite a operação para o valor informado");
        System.out.println("1-Debito   2-Credito");
        op=entrada.nextInt();
        switch(op){
            case 1:
                deb=saldo-valor;
                if(deb<=0){
                    System.out.println("Conta ultrapassou o limite!");
                }
                System.out.println("Seu saldo é: R$ "+deb);
                break;
            case 2:
                cred=saldo+valor;
                System.out.println("Seu saldo é: R$ "+cred);
                break;
            default:
                System.out.println("Operação Inválida!!!");
        }
                
        }
    }
    
