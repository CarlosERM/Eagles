import java.util.Scanner;

public class atividade01 {

  static void bubbleSort(int vetor[]) {
    //pega o tamanho do vetor.
    int number = vetor.length;

    int numberAux;
    boolean troca;

    for(int i = 0; i < number -1; i++) { 

      troca = false; 

      for(int j = 0; j < number - i -1; j++) {
        //Exemplo: 5 > 4
        // O (j + 1) garante que, na primeira repetição, todos os elementos do array sejam comparados.
        
        //Analise se a posição j tem um valor maior que a posição j + 1
        if (vetor[j] > vetor[j + 1]) {
          troca = true;

          numberAux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = numberAux;

        } 
        
      } 
      //Caso nenhuma troca aconteça, quebra o loop.
      if (troca == false) {
        break;
      }   
    }     
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int vetor[] = new int [5];
    //pega o input do usuário
    for (int i = 0; i < 5; i++){
        System.out.print("Digite o " + (i + 1) + "º: ");
        vetor[i] = scan.nextInt();         
    }  

    bubbleSort(vetor);

    System.out.print("Os valores ordenados são:");

    for (int z = 0; z < 5; z++) {        
        System.out.print(" " + vetor[z]);
    }

    System.out.print("\nO maior valor é: " + vetor[4]);

    scan.close();   
  }
}