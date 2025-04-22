import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");
		
		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		//Excluir um elemento da coleção
		frutas.remove("Morango");
		
		//Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		//Listar os dados
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		//Criação de coleção ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//Adicionamos todos os elementos da coleção Set (frutas) 
		//Na coleção ArrayList(frutasList)
		frutasList.addAll(frutas);
		
		//Ordenamos frutasList em ordem crescente
		frutasList.sort(null);
		
		//Exibimos frutasList em ordem crescente
		System.out.println("Exibir os dados do Array List");
		frutasList.forEach(System.out::println);

	}

}
