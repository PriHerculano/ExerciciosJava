package manzano;
import java.util.Scanner;

public class Ex07CCalcularOVolume {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio da lata: ");
		float raio = sc.nextFloat();
		System.out.println("Digite a da altura da lata: ");
		float altura = sc.nextFloat();
		
		double volume = Math.PI*Math.pow(raio,2)*altura;
		System.out.printf("O volume da lata de óleo será:= %.2f %n",(volume));
		sc.close();
	}
}
