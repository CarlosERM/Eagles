// O Usuário vai informar 1 valor e o programa vai retornar se este numero é primo
// Um número primo é um número que só pode ser dividido por 1 e por ele mesmo.

import java.util.Scanner;

public class atividade03 {

      public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double input;
        long resposta;
        int div = 0;
        boolean repetiu = false;

        do {
          if(repetiu) {
            System.out.println("Número inválido.");
            System.out.print("Digite um número válido: ");
            input = scan.nextDouble();
          } else {
            System.out.print("Digite um número: ");
            input = scan.nextDouble();
  
          }
     
          resposta = (long) input;
          for (int i = 1; i <= input; i++) {
            if (input % i == 0) { 
              div++;
            }
          }

          if(repetiu == false) repetiu = !repetiu;

        } while (resposta <= 0 || input % 1 != 0);

    if (div == 2) {
      System.out.println("O número " + resposta + " é primo!");
    }  else {
      System.out.println("O número " + resposta + " não é primo!"); 
      scan.close();
    }
  }
}
