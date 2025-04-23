import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabrício");
		fila.add("Victor");
		
		//Exibimos a fila na tela
		System.out.println(fila);
		//Retiramos um elemento da fila
		fila.remove();
		
		System.out.println(fila);
		//Adicionamos um elemento no final da fila
		fila.add("Thiago");
		
		System.out.println(fila);
		//Exibimos o primeiro elemento da fila
		System.out.println(fila.peek());
		//Exibimos e removemos o primeiro elemento da fila
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println("A maria está na fila? " + fila.contains("Maria"));
		System.out.println("O Carols está na fila? " + fila.contains("Carlos"));
		
		System.out.println("Qual é o tamanho da fila? " + fila.size());
		
		int contador = 0;
		
		for( var pessoa : fila) {
			contador++;
			if(pessoa.equalsIgnoreCase("maria")) {
				System.out.println("Posição " + contador);
			}
		}
		
	}

}
