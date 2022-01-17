// O Usuário pode informar 'N' números naturais, quando usuário informar -1 o programa exibe o MENOR e o MAIOR
import java.util.Scanner;

public class atividade02 {

      public static void main(String[] args) {
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, input, i = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Digite o " + (i + 1) + "º: ");
            input = scan.nextInt();
            
            if(menor > input && input != -1) {
                menor = input;
            }

            if(maior < input) {
                maior = input;
            }

            i++;
        } while(input != -1);

        System.out.println("\nO menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);



        scan.close();
      }
}
