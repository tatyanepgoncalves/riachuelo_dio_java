import java.util.Scanner;

public class NumeroParOuImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int firstNumber = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int segundNumber = scanner.nextInt();

    System.out.println("Escolha a opção (digite 'par' ou 'impar')");
    String choose = scanner.next();

    scanner.close();

    System.out.println("\nNúmeros " + choose + " no intervalo de " + firstNumber + " a " + segundNumber + " em ordem decrescente:");

    for (int i = segundNumber; i >= firstNumber; i--) {
        if (choose.equalsIgnoreCase("par")) {
            // Se a escolha for 'par', verifica se o número atual é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } else if (choose.equalsIgnoreCase("impar")) {
            // Se a escolha for 'ímpar', verifica se o número atual é ímpar
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

  }
}