package faccat;
import java.util.Scanner;

public class Ex05Antecessor {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int numero01=sc.nextInt();
		int antecessor=numero01-1;
		System.out.println("O antecessor de "+numero01+" � "+antecessor+"!");
		sc.close();
	}
}
