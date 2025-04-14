import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Leitura dos dados
		System.out.println("Digite o salário: ");
		float salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();
		//Calculo do novo salário
		float novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
	}

}
