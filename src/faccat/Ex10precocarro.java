package faccat;
import java.util.Scanner;

//28% distribuidor
//45% impostos
//double é o tipo de dado superior ao float

public class Ex10precocarro {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o custo de fábrica:");
		float custofabrica = sc.nextFloat();
		double distribuidor = custofabrica * 0.28;
		double impostos = custofabrica * 0.45;
		double valorFinal = custofabrica + distribuidor + impostos;
		System.out.println("O custo total do carro será: " + valorFinal);
		sc.close();
	}
}
