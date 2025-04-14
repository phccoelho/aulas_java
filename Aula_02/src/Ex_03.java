import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		float adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		float horasExtras = leia.nextFloat();
		System.out.println("Digite os Descontos de colaborador: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário líquido é :" + salarioLiquido);

	}

}
