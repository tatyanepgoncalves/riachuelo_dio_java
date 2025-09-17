import java.math.BigDecimal;
import java.util.Scanner;

public class PurchaseValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String valorCompra = scanner.nextLine();
    System.out.println(calcularDesconto(valorCompra));
    scanner.close();
  }

  public static String calcularDesconto(String valorCompra) {
    BigDecimal valor = new BigDecimal(valorCompra);
    BigDecimal descontoPercentual;

    if (valor.compareTo(new BigDecimal("50.00")) < 0) {
      descontoPercentual = BigDecimal.ZERO;
    } else if (valor.compareTo(new BigDecimal("100.00")) <= 0) {
      descontoPercentual = new BigDecimal("0.10");
    } else {
      descontoPercentual = new BigDecimal("0.20");
    }

    BigDecimal percentualFormatado = descontoPercentual.multiply(new BigDecimal(100));
    return "Desconto de " + percentualFormatado.stripTrailingZeros().toPlainString() + "%";
  }
}