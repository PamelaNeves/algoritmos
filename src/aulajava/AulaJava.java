package aulajava;


import java.util.Scanner;

public class AulaJava {
    public static void main(String[] args) {
        double valor,juros,total,rendimento;
        Scanner entrada = new Scanner(System.in);
                System.out.println("Informe o valor do depósito");
                valor=entrada.nextDouble();
                System.out.println("Informe a taxa de juros:");
                juros=entrada.nextDouble();
                rendimento=((valor*juros)/100);
                total=valor+rendimento;
                System.out.println("O valor do rendimento é: R$"+rendimento+" e o seu saldo é: R$ "+total);
    }

   
}
