package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, contador = 0, menor = 0, maior = 0;
		//Laço de repetição
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			//Separa maior e menor e faz a contagem
			if (idade < 21 && idade> 0) {
				menor++;
			}else if(idade>50) {
				maior++;
			}
			
		}
		//Lança na tela o resultado
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menor);
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", maior);
	}

}
