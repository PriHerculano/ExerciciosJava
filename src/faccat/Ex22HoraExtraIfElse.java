package faccat;
import java.util.Scanner;

public class Ex22HoraExtraIfElse {
	public static void main (String[]args) {
 Scanner sc=new Scanner(System.in);
  System.out.print("Quantas horas foram trabalhads esse mês: ");
  float horames =sc.nextFloat();
  System.out.print("Quanto o funcionário recebe por hora trabalhada: ");
  float valorhora =sc.nextFloat();
  float salario = horames * valorhora;
  float horaextra = 0;
  if (horames <= 160) {
	  System.out.println("O salário será :" + salario);
} else if (horames > 160) {
	horaextra = valorhora/2;
	salario = salario + horaextra;
	System.out.println("O salário será :" + salario);
}{

}
sc.close();
	}
}
