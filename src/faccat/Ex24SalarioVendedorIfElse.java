package faccat;
import java.util.Scanner;

public class Ex24SalarioVendedorIfElse {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Informe o salário fixo do vendedor: ");
	        float salarioFixo = sc.nextFloat();

	        System.out.println("Informe o valor das vendas efetuadas: ");
	        float valorVendas = sc.nextFloat();

	        float comissao = 0;
	        float salarioTotal = 0;

	        if (valorVendas <= 1500) {
	            comissao = valorVendas * 0.03f;
	        } else {
	            float valorExcedente = valorVendas - 1500;
	            comissao = 1500 * 0.03f + valorExcedente * 0.05f;
	        }

	        salarioTotal = salarioFixo + comissao;

	        System.out.println("O salário total do vendedor é: " + salarioTotal);
	    }
	}
