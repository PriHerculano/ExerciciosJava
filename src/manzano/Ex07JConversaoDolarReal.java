package manzano;
import java.util.Scanner;

public class Ex07JConversaoDolarReal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolares = scanner.nextDouble();
        double valorReal = quantidadeDolares * cotacaoDolar;
        System.out.printf("O valor em reais é: R$ %.2f", valorReal);
        scanner.close();
    }
}
