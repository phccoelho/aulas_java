package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int contador = 0;
		// Leitura dos intervalos
		System.out.println("Digite o primeiro número do intervalo: ");
		int numero1 = leia.nextInt();
		System.out.println("Digite o segundo último do intervalo: ");
		int numero2 = leia.nextInt();
		// Indica se o intervalo será invalido ou não
		if(numero1 > numero2) {
			System.out.println("Intervalo inválido!");
			return;
		}
		//Laço para verificação dos números
		for(contador=numero1; contador<=numero2; contador++) {
			//Verificação se é múltiplo ou não
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.printf("\n%d é múltiplo de 3 e 5", contador);
			}
		}
		leia.close();
	}

}
