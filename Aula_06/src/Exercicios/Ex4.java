package Exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		//Coloca os números no vetor
		for(int i=0; i<10; i++) {
			System.out.printf("Digite o número da posição %d da lista:", i + 1);
			numeros.add(leia.nextInt());
			
		}
		
		System.out.println("Digite um número que você deseja encontrar: ");
		int numero = leia.nextInt();
		
		//Cria o ArrayList
		ArrayList<Integer> numerosList = new ArrayList<Integer>();
		
		numerosList.addAll(numeros);
		
		//Verifica se o número está no Array ou não
		if (numerosList.contains(numero)) {
            int posicao = numerosList.indexOf(numero);
            System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " da lista.");
        } else {
            System.out.println("O número " + numero + " não foi encontrado na lista.");
        }
		
		
		leia.close();
	}

}
