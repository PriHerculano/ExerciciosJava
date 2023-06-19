package faccat;
import java.util.Scanner;

public class Ex27LerValor {
	
	    public static void main(String[]args){

	        //Declarando valor

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Digite um valor: ");
	        int numero = sc.nextInt();
	        // resultado
	        if (numero > 0) {
	            System.out.println("O número é positivo");
	        } else if (numero < 0) {
	            System.out.println("O número é negativo");
	        } else {
	            System.out.println("O número é igual a zero");
	        }

	    }
	}