import java.util.Scanner;
public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		int contador = 1;
		while(contador <= 10) {
			System.out.printf("\n %d * %d = %d", numero, contador, (numero * contador));
			contador++;
		}
		
		
		leia.close();
	}

}
