package manzano;
import java.util.Scanner;

public class Ex07KConversaoRealDolar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cota��o do d�lar: ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Digite a quantidade de reais: ");
        double quantidadeReais = scanner.nextDouble();
        double valorDolar = quantidadeReais / cotacaoDolar;
        System.out.printf("O valor em d�lares �: U$ %.2f", valorDolar);
        scanner.close();
    }
}
