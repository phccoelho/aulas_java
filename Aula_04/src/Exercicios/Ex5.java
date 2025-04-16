package Exercicios;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma = 0;
		//Laço de repetição
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			//Verifica se o número é positivo
			if(numero > 0) {
				soma = soma + numero;
			}
		}while(numero != 0);//Se for 0 sai do loop
		
		//Faz o print na tela
		System.out.printf("A soma dos numeros positivos é: %d", soma);
		leia.close();
	}
}
