import java.util.Scanner;

public class atividade01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long vetor[] = new long [5];
    long maior = Integer.MIN_VALUE;
    double resposta;
    boolean chave;
    //pega o input do usuário
    for (int i = 0; i < 5; i++){
      chave = true;
        do {

          if(chave) {
            System.out.print("Digite o " + (i + 1) + "º: ");
            resposta = scan.nextDouble();
            vetor[i] = (long) resposta;
          } else {
            resposta = 0;
            System.out.println("O NÚMERO DIGITADO É INVÁLIDO.");
          }
          chave = !chave;
        } while(resposta < 0 || resposta != (long) vetor[i]);
       
        if(maior < vetor[i]) {
          maior = vetor[i];
        }
    }  
    System.out.print("\nO maior valor é: " + maior + "\n");
    scan.close();   
  }
}