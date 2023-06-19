package manzano;
import java.util.Scanner;

public class Ex07ECalcularPrestacaoAtraso {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da prestação em atraso: R$");
        double valor = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = scanner.nextDouble();
        System.out.print("Digite o tempo de atraso (em meses): ");
        double tempo = scanner.nextDouble();
        double prestacao = valor + valor * taxa / 100.0D * tempo;
        System.out.printf("O valor da prestação em atraso é: R$%.2f", prestacao);
        scanner.close();
    }
}

