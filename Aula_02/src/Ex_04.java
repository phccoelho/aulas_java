import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite o primeiro valor: ");
		float valor1 = leia.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float valor2 = leia.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		float valor3 = leia.nextFloat();
		System.out.println("Digite o quarto valor: ");
		float valor4 = leia.nextFloat();
		
		float diferenca = (valor1 * valor2) - (valor3 * valor4);
		System.out.println("A diferença entre os produtos é: " + diferenca);
		
	}

}
