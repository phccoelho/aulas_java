package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;
		int continua = 1;
		
		//Adiciona ao Array List as cores digitadas
		while(continua == 1) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
			System.out.println("Quer continuar? Sim (1)/ Não(0): ");
			continua = leia.nextInt();
		}
		
		
		//Coloca na tela o vetor
		System.out.println("Vetor: ");
		cores.forEach(System.out::println);
		
		//Ordenar a coleção
		cores.sort(null);
				
		//Exibe os dados ordenados, em orden crescente
		System.out.println("Exibe os dados em ordem crescente: ");
		cores.forEach(System.out::println);
		
		leia.close();

	}

}
