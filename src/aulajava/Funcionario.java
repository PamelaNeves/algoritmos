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
public class Funcionario {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int op;
        double horas,salario;
        
        System.out.println("Informe as horas trabalhadas no mês");
        horas=entrada.nextDouble();
        System.out.println("Informe o nível do seu cargo: 1,2 ou 3");
        op=entrada.nextInt();
        switch(op){
            case 1:
                salario=12*horas;
                System.out.println("Seu salário é: R$ "+salario);
                break;
            case 2:
                salario=18*horas;
                System.out.println("Seu salário é: R$ "+salario);
                break;
             case 3:
                salario=25*horas;
                System.out.println("Seu salário é: R$ "+salario);
                break;
             default:
                 System.out.println("Nível de cargo inválido!");
        }
    }
}
