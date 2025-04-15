import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = leia.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
		leia.close();
	}

}
