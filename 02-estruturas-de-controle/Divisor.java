import java.util.Scanner;

public class Divisor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número (divisor):");
    int firstNumber = scanner.nextInt();

    int otherNumber = firstNumber;

    while (otherNumber % firstNumber == 0) {
      System.out.println("Digite outro número (ou um que não seja divisível por " + firstNumber + " para sair):");
      otherNumber = scanner.nextInt();

      if (otherNumber < firstNumber) {
        System.out.println("Número ignorado, pois é menor que " + firstNumber + ".");
        continue;
      }
    }

    System.out.println("A divisão de " + otherNumber + " por " + firstNumber + " teve resto diferente de 0. O programa finalizou!");
    scanner.close();

  }
}