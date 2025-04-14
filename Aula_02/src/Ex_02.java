import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Leitura dos valores
		System.out.println("Digite a primeira nota: ");
		float nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float nota3 = leia.nextFloat();
		System.out.println("Digite a quarta nota: ");
		float nota4 = leia.nextFloat();
		//Calculo da média
		float media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		System.out.println("A sua média é: " + media);
		if (media >= 6) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
	}
}
