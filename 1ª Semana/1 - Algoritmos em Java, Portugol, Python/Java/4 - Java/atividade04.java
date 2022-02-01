// O usuário vai informar um valor e devera ser retornado o seu fatorial.
// Conhecemos como fatorial de um número natural a multiplicação desse número por seus antecessores, com exceção do zero. Vale ressaltar que, para que essa operação faça sentido, "n" é um número natural, ou seja, não calculamos fatorial de um número negativo, ou mesmo de um número decimal, ou de frações. 
// Exemplos: 
// 4! = 4 · 3 · 2 · 1 = 24
// 5! = 5 · 4 · 3 · 2 · 1 = 120
// 6! = 6 · 5 · 4 · 3 · 2 · 1 = 720
// 7! = 7 · 6 · 5 · 4 · 3 · 2 · 1 = 5040

import java.math.BigInteger;
import java.util.Scanner;

public class atividade04 {
  public static void main(String[] args) {

    long input;
    BigInteger fib = new BigInteger(1 + "");
    Scanner scan = new Scanner(System.in);

    do {
    System.out.print("Digite um número para calcularmos o seu fatorial: ");
    input = scan.nextLong();

    if(input < 1) {
      System.out.println("\nValor inválido(O valor deve ser maior que 1).");
    }
    } while (input < 1);

    for (long i = 1; i <= input; i++) {
      BigInteger iBig = new BigInteger(i + "");
      fib = fib.multiply(iBig);           
    }
    System.out.println("-----------------------------------");
    System.out.println("O fatorial de " + input + ": " + fib);
    System.out.println("-----------------------------------");


    scan.close();
  }  
}
