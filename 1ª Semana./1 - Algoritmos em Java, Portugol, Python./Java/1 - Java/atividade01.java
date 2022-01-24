import java.util.Scanner;

public class atividade01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int vetor[] = new int [5];
    int maior = Integer.MIN_VALUE;

    //pega o input do usuário
    for (int i = 0; i < 5; i++){
        System.out.print("Digite o " + (i + 1) + "º: ");
        vetor[i] = scan.nextInt();
        
        if(maior < vetor[i]) {
          maior = vetor[i];
        }
    }  
    System.out.print("\nO maior valor é: " + maior + "\n");
    scan.close();   
  }
}