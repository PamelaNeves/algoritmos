package aulaJava;
import java.util.Scanner;

/**
 *
 * @author faculdade.ads
 */
public class Peso {
        
        public static void main(String[] args) {
        double peso, formula;
        int codigo;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Saiba seu peso em outro planeta!!!");
        System.out.println("Informe seu peso:");
        peso=entrada.nextDouble();
        System.out.println("Digite o código do planeta desejado:");
        System.out.println("1 - Mercúrio");
        System.out.println("2 - Vênus");
        System.out.println("3 - Marte");
        System.out.println("4 - Júpter");
        System.out.println("5 - Saturno");
        System.out.println("6 - Urano");
        System.out.println("0 - Para sair do programa");
        codigo=entrada.nextInt();
        switch(codigo){
            case 1:
                formula=(peso/10)*0.37;
                System.out.println("Seu peso em Mercúrio é: "+formula);
                break;
            case 2:
                formula=(peso/10)*0.88;
                System.out.println("Seu peso em Vênus é: "+formula);
                break;
            case 3:
                formula=(peso/10)*0.38;
                System.out.println("Seu peso em Marte é: "+formula);
                break;
            case 4:
                formula=(peso/10)*2.64;
                System.out.println("Seu peso em Júpter é: "+formula);
                break;
            case 5:
                formula=(peso/10)*1.15;
                System.out.println("Seu peso em Saturno é: "+formula);
                break;
            case 6:
                formula=(peso/10)*1.17;
                System.out.println("Seu peso em Urano é: "+formula);
                break;
            case 0:
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

  }
