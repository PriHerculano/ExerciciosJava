package faccat;
import java.util.Scanner;

//total eleitores, votos brancos, votos nulos e votos v�lidos
public class Ex08Votos {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Total de eleitores: ");
		float totaleleitores = sc.nextFloat();
		System.out.println("Votos brancos: ");
		float votosbrancos = sc.nextFloat();
		System.out.println("Votos nulos: ");
		float votosnulos = sc.nextFloat();
		//System.out.println("Votos v�lidos:");
		//int votosvalidos = sc.nextInt();
		float votosvalidos = totaleleitores - votosbrancos - votosnulos;
		//int resultadonulos = totaleleitores - votosbrancos - votosvalidos;
		//int resultadobrancos = totaleleitores - votosnulos - votosvalidos;
		float porcentagemnulos = (float)(votosnulos/totaleleitores)*100;
		float porcentagembrancos = (float)(votosbrancos/totaleleitores)*100;
		float porcentagemvalidos = (float)(votosvalidos/totaleleitores)*100;
		System.out.println("A porcentagem de votos v�lidos �: " + porcentagemvalidos +
				"\n A porcentagem de votos nulos �: " + porcentagemnulos +
				"\n A porcentagem de votos brancos �: " + porcentagembrancos);
		sc.close();
		}
	}
