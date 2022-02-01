// O Usuário pode informar 'N' números naturais, quando usuário informar -1 o programa exibe o MENOR e o MAIOR
import java.util.Scanner;

public class atividade02 {

      public static void main(String[] args) {
        long menor = Long.MAX_VALUE, maior = Long.MIN_VALUE, i = 0;
        double input;
        long resposta;
        Scanner scan = new Scanner(System.in);
        do {
            do {
               
                System.out.print("Digite o " + (i + 1) + "º: ");
                input = scan.nextDouble();
                resposta = (long) input;
                
                if(resposta == -1) {
                    break;
                }
                
                if(input % 1 != 0.0 || resposta < 0) {
                    System.out.println("Valor inválido.");
                    continue;
                }

            } while(input % 1 != 0.0 || resposta < 0);

            if(menor > resposta && resposta != -1) {
                menor = resposta;
            }

            if(maior < resposta && resposta != -1) {
                maior = resposta;
            }
            i++;
        } while(resposta != -1);

        if(maior == Long.MIN_VALUE || menor == Long.MAX_VALUE) {
            System.out.println("Nenhum valor foi armazenado!");
        } else {
            System.out.println("\nO menor valor é: " + menor);
            System.out.println("O maior valor é: " + maior);
        }
        scan.close();
      }
}
