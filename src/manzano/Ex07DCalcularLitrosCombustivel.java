package manzano;
import java.util.Scanner;

public class Ex07DCalcularLitrosCombustivel {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.printf("Velocidade média: %.2f km/h\n", velocidade);
        System.out.printf("Tempo gasto: %.2f horas\n", tempo);
        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f L", litrosUsados);

        sc.close();
    }
}

