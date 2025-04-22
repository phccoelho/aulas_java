package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que quer encontrar no vetor: ");
		int valor = leia.nextInt();
		
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		//conta o número de vezes que um número foi encontrado
		int count = 0;
		
		for(int indice = 0; indice < vetorInteiros.length; indice ++) {
			if(valor == vetorInteiros[indice]) {
				count = count + 1;
				System.out.printf("O número %d foi encontrado na posição: %d ", valor, indice );
			}
		}
		if(count == 0) {
			System.out.printf("O número %d não foi encontrado ", valor );
		}
		
	}

}
