package faccat;
import java.util.Scanner;

public class Ex26QntdEstoque {
    public static void main(String[]args){

        //Declarando
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque: ");
        float estoqueAtual = sc.nextFloat();

        System.out.println("Digite a quantidade máxima em estoque: ");
        float estoqueMaximo = sc.nextFloat();

        System.out.println("Digite a quantidade minima em estoque: ");
        float estoqueMinimo = sc.nextFloat();
        //Calculo

        float quantidadeMedia= (estoqueMaximo + estoqueMinimo)/2;

        //resultado

        if (estoqueAtual>=quantidadeMedia){
            System.out.println("Não efetuar a compra");
        } else{
            System.out.println("Efetuar a compra");
        }
    }
    }
