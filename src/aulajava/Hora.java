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
public class Hora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int horaInicio, minutoInicio, horaFim, minutoFim, duracaoHoras, duracaoMinutos;
        System.out.println("Informe a hora do início do jogo em horas e minutos");
        horaInicio=entrada.nextInt();
        minutoInicio=entrada.nextInt();
        System.out.println("Informe a hora do término do jogo em horas e minutos");
        horaFim=entrada.nextInt();
        minutoFim=entrada.nextInt();
        duracaoHoras=horaFim-horaInicio;
        duracaoMinutos=minutoFim-minutoInicio;
        System.out.println("A duração do jogo é de: "+duracaoHoras+" horas e "+duracaoMinutos+" minutos");
    }
    
}
