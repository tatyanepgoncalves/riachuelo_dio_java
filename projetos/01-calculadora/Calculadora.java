import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("|--------- MENU -------------|");
      System.out.println("| [1] Adição                 |");
      System.out.println("| [2] Subtração              |");
      System.out.println("| [3] Multiplicação          |");
      System.out.println("| [4] Divisão                |");
      System.out.println("| [5] Potenciação            |");
      System.out.println("| [6] Sair                   |");
      System.out.println("|----------------------------|");
      System.out.print("Digite a opção desejada: ");
      int option = scanner.nextInt();
      
      
      
      if (option == 1) {
        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scanner.nextDouble();
        double result;
        result = n1 + n2;
        System.out.println("Resultado da adição: " + result);
      } else if (option == 2) {
        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scanner.nextDouble();
        double result;
        result = n1 - n2;
        System.out.println("Resultado da subtração: "+ result);
      } else if (option == 3) {
        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scanner.nextDouble();
        double result;
        result = n1 * n2;
        System.out.println("Resultado da multiplicação: " + result);
      } else if (option == 4) {
        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scanner.nextDouble();
        double result;
        result = n1 / n2;
        System.out.println("Resultado da divisão: " + result);
      } else if (option == 5) {
        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = scanner.nextDouble();
        double result;
        result = Math.pow(n1, n2);
        System.out.println("Resultado da potenciação: " + result);
      } else if (option == 6) {
        scanner.close();
        System.out.println("Saindo da calculadora!");
        break;
      } else {
          System.out.println("Indique uma opção válida.");
      }

    } while (true);
    
    scanner.close();

    
        
  }
}