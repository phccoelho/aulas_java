package Exercícios;


import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int escolha = 1;
		
		while(escolha != 0) {
			
			System.out.println("Bem vindo ao nosso programa: ");
			System.out.println("***********************************");
			System.out.println("   1- Adicionar Livro a pilha    ");
			System.out.println("   2- Listar todos os livros     ");
			System.out.println("   3- Retirar Livro da fila      ");
			System.out.println("   0- Sair                         ");
			System.out.println("***********************************");
			System.out.println("Entre com a opção desejada: ");
			escolha = leia.nextInt();
				
			if(escolha == 1) {
				System.out.println("Digite o nome do livro que quer adicionar a pilha: ");
				leia.nextLine();
				pilha.push(leia.nextLine());
				System.out.println("Livro adicionado!");
			}
			if(escolha == 2) {
				if(pilha.size() == 0) {
					System.out.println("Pilha vazia");
				}else {
				System.out.println("Os livros da pilha são: ");
				System.out.println(pilha);
				}
			}
			if(escolha == 3) {
				if(pilha.size() == 0) {
					System.out.println("Erro ao retirar Livro.(pilha vazia)");
				}else {
					System.out.printf("Livro %s retirado! \n\n", pilha.pop());
				}
			}
			
		}
		leia.close();
	}

}
