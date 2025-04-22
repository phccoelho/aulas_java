package Exercicios;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		
		int matrizInteiros[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		
		int valor = 0;
		int soma1 = 0;
		int soma2 = 0;
		System.out.printf("Números da diagonal principal :  \n");
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				if(linha == coluna) {
					System.out.printf("%d ", matrizInteiros[linha][coluna]);
					soma1 = soma1 + matrizInteiros[linha][coluna];
				}
			}
		}
		
		
		System.out.printf("\nNúmeros da diagonal secundária :  \n");
		for(int linha = 0; linha<3; linha++) {
				valor = matrizInteiros[linha][2-linha];
				System.out.printf("%d ", valor);
				soma2 = soma2 + valor;
			}
		
		System.out.println("\nA soma da diagonal principal é: " + soma1);
		System.out.println("A soma da diagonal secundária é: " + soma2);
		
		
		
		
		
		
	}
}
