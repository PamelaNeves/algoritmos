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
public class Media {
    public static void main(String[] args) {
        int n1,n2,n3;
        double media,aprovado;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Informe as três notas do aluno:");
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        media=(n1+n2+n3)/3;
        if(media>=0 && media<=3){
            System.out.println("Reprovado");
        }else if(media>=3.1 && media<=6){
            System.out.println("Em exame");
            aprovado=6.1-media;
            System.out.println("Você precisa tirar "+aprovado+" para ser aprovado");
        }else{
            System.out.println("Aprovado!!!");            
        }
    }
    
}
