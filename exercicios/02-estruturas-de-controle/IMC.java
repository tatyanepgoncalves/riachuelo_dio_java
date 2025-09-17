import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sua altura: ");
    Float height = scanner.nextFloat();
    System.out.println("Digite o seu peso: ");
    float weight = scanner.nextFloat();

    scanner.close();

    float imc = weight / (height * height);

    if (imc <= 18.5) {
      System.out.println("Você está abaixo do peso!");
    } else if (imc <= 24.9) {
      System.out.println("Você está no seu peso ideal!");
    } else if (imc <= 29.9) {
      System.out.println("Você está levemente acima do peso!");
    } else if (imc <= 34.9) {
      System.out.println("Você está na obesidade grau I!");
    } else if (imc <= 39.9) {
      System.out.println("Você está na obesidade grau II (Severa)!");
    } else {
      System.out.println("Você está na obesidade grau III (Mórbida)!");
    }

  }
}
