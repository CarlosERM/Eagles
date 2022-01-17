// O Usuário vai informar 1 valor e o programa vai retornar se este numero é primo
// Um número primo é um número que só pode ser dividido por 1 e por ele mesmo.

import java.util.Scanner;

public class atividade03 {

      public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int input;
        int div = 0;

        do {
          System.out.print("Digite um número: ");
          input = scan.nextInt();

          for (int i = 1; i <= input; i++) {
            if (input % i == 0) { 
            div++;
            }
          }  
            if (div == 2) {
          System.out.println("O número " + input + " é primo!");
          }  else {
          System.out.println("O número " + input + " não é primo!");       
      } 
      
      div = 0;         

    } while (input >= 0);

    scan.close();

  }
}
