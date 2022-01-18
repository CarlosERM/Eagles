// O usuário vai informar o valor do álcool e o valor da gasolina, o programa vai retornar qual compensa mais (considerar a proporção de 70%).

import java.util.Scanner;

public class atividade05 {
  public static void main(String[] args) {

    double valorAlcool;
    double valorGasolina;
    double percentual = 0.70;
    String mensagem;

    Scanner scan = new Scanner(System.in);    

    System.out.print("Digite o valor do gasolina: ");
    valorGasolina = scan.nextDouble();

    System.out.print("Digite o valor do álcool: ");
    valorAlcool = scan.nextDouble();

    if (valorAlcool <= percentual * valorGasolina) {
      mensagem = "álcool";
    } else {
      mensagem = "gasolina";
    }

    System.out.print("O melhor custo benefício é " + mensagem + ".");    

    scan.close();
  }
}