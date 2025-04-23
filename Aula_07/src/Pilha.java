import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		//Cria a estrutura de dados pilha
		Stack<String> pilha = new Stack<String>() ;
		
		//Adiciona elementos na pilha
		pilha.add("Comunicação não Violenta");
		pilha.add("It a coisa");
		pilha.add("A coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um Banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O Código da Vinci");
		
		System.out.println(pilha);
		//Retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		//Adiciona um elemento na pilha
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		//Exibe o elemento que está no topo da pilha
		System.out.println(pilha.peek());
		//Verifica se o elemento existe na pilha
		System.out.println("O livro Diário de um Banana, existe na pila? " + pilha.contains("Diário de um Banana"));
		

	}

}
