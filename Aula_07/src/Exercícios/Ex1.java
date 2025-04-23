package Exercícios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		int escolha = 1;
		
		while(escolha != 0) {
			
			System.out.println("Bem vindo ao nosso programa: ");
			System.out.println("***********************************");
			System.out.println("   1- Adicionar Cliente na fila    ");
			System.out.println("   2- Listar todos os clientes     ");
			System.out.println("   3- Retirar Cliente da fila      ");
			System.out.println("   0- Sair                         ");
			System.out.println("***********************************");
			System.out.println("Entre com a opção desejada: ");
			escolha = leia.nextInt();
				
			if(escolha == 1) {
				System.out.println("Digite o nome do cliente que quer adicionar a fila: ");
				fila.add(leia.next());
				System.out.println("Cliente adicionado!");
			}
			if(escolha == 2) {
				if(fila.size() == 0) {
					System.out.println("Fila vazia");
				}else {
				System.out.println("Os clientes da fila são: ");
				System.out.println(fila);
				}
			}
			if(escolha == 3) {
				if(fila.size() == 0) {
					System.out.println("Erro ao retirar cliente.(Fila vazia)");
				}else {
					System.out.printf("Cliente %s retirado! \n\n", fila.poll());
				}
			}
			
		}
		leia.close();
	}

}
