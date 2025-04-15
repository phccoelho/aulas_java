import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float numero1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		float numero2 = leia.nextFloat();
		
		System.out.println("Digite o código da operação (1 a 4): ");
		int codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, (numero1 + numero2));
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, (numero1 - numero2));
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, (numero1 * numero2));
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, (numero1 / numero2));
			break;
			
		}
		leia.close();
	}

}
