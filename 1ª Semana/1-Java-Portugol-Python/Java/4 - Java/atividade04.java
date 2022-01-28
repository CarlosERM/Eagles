// O usuário vai informar um valor e devera ser retornado o seu fatorial.
// Conhecemos como fatorial de um número natural a multiplicação desse número por seus antecessores, com exceção do zero. Vale ressaltar que, para que essa operação faça sentido, "n" é um número natural, ou seja, não calculamos fatorial de um número negativo, ou mesmo de um número decimal, ou de frações. 
// Exemplos: 
// 4! = 4 · 3 · 2 · 1 = 24
// 5! = 5 · 4 · 3 · 2 · 1 = 120
// 6! = 6 · 5 · 4 · 3 · 2 · 1 = 720
// 7! = 7 · 6 · 5 · 4 · 3 · 2 · 1 = 5040

import java.util.Scanner;

public class atividade04 {
  public static void main(String[] args) {

    int input;
    int fib = 1;

    Scanner scan = new Scanner(System.in);

    do {
    System.out.print("Digite um número para calcularmos o seu fatorial: ");
    input = scan.nextInt();
    } while (input < 1);

    for (int i = 1; i <= input; i++) {
      fib = fib * i;           
    }

    System.out.println("O fatorial de " + input + ": " + fib);

    scan.close();
  }  
}
