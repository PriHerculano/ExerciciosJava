package manzano;
import java.util.Scanner;

public class Ex07IDiferencaQuadrado {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        int diferenca = a - b;
        int quadradoDiferenca = diferenca * diferenca;
        System.out.printf("O quadrado da diferença entre A e B é: %d", quadradoDiferenca);
        scanner.close();
    }
}
