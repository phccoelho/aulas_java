import java.util.Scanner;

public class Variaveis {
	//Definição das variaveis
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero_01 = leia.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int numero_02 = leia.nextInt();
		char opcao ='V';
		boolean menorIdade = true;
		
		String nome = "Pedro";	
		//Definição da constante PI	
		final Double PI = 3.1415;
	
	
	//Exibição em Tela
		System.out.printf("Variavel numero 1 é igual a: %d\n" , numero_01);		
		System.out.println("Variavel numero 2 é igual a: " + numero_02);
		System.out.printf("Constante Pi é: %.2f\n" , PI);
		System.out.println("Váriavel em letra maiúscula: " + nome.toUpperCase() );
	}

}
