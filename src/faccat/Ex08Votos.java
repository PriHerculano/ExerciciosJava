package faccat;
import java.util.Scanner;

//total eleitores, votos brancos, votos nulos e votos válidos
public class Ex08Votos {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Total de eleitores: ");
		float totaleleitores = sc.nextFloat();
		System.out.println("Votos brancos: ");
		float votosbrancos = sc.nextFloat();
		System.out.println("Votos nulos: ");
		float votosnulos = sc.nextFloat();
		//System.out.println("Votos válidos:");
		//int votosvalidos = sc.nextInt();
		float votosvalidos = totaleleitores - votosbrancos - votosnulos;
		//int resultadonulos = totaleleitores - votosbrancos - votosvalidos;
		//int resultadobrancos = totaleleitores - votosnulos - votosvalidos;
		float porcentagemnulos = (float)(votosnulos/totaleleitores)*100;
		float porcentagembrancos = (float)(votosbrancos/totaleleitores)*100;
		float porcentagemvalidos = (float)(votosvalidos/totaleleitores)*100;
		System.out.println("A porcentagem de votos válidos é: " + porcentagemvalidos +
				"\n A porcentagem de votos nulos é: " + porcentagemnulos +
				"\n A porcentagem de votos brancos é: " + porcentagembrancos);
		sc.close();
		}
	}
