// O Usuário pode informar 'N' números naturais, quando usuário informar -1 o programa exibe o MENOR e o MAIOR
import java.util.Scanner;

public class atividade02 {

      public static void main(String[] args) {
        long menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, i = 0;
        double input;
        long resposta;
        Scanner scan = new Scanner(System.in);
        do {


            do {
                System.out.print("Digite o " + (i + 1) + "º: ");
                input = scan.nextDouble();
                System.out.println(input);
                
                resposta = (long) input;
                System.out.println((double)resposta);
            } while(input < 0 || input != (double) resposta);

            if(menor > resposta && resposta != -1) {
                menor = resposta;
            }

            if(maior < resposta) {
                maior = resposta;
            }
            i++;
        } while(input != -1);

        System.out.println("\nO menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);



        scan.close();
      }
}
