package faccat;
import java.util.Scanner;

public class Ex25ContadoBanco {
	
	    public static void main(String[]args){
	        Scanner sc= new Scanner (System.in);

	        System.out.println("Numero da conta do cliente: ");
	        int numeroConta = sc.nextInt();

	        System.out.println("Digite o seu saldo: ");
	        float Saldo = sc.nextFloat();

	        System.out.println("Digite o seu débito: ");
	        float Debito = sc.nextFloat();

	        System.out.println("Digite o seu crédito: ");
	        float Credito = sc.nextFloat();

	        //Declarações de numero de conta, débito e crédito

	        float saldoAtual = Saldo - (Debito + Credito);  //calculo do saldo

	        if (saldoAtual >=0){
	            System.out.println("Seu saldo é positivo");
	        } else{
	            System.out.println("Seu saldo é negativo");
	        }
	    }
	}
  