import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		String nome = leia.next();
		System.out.println("Digite o Idade do doador: ");
		int idade = leia.nextInt();
		if(idade > 79) {
			System.out.printf("%s não está apto para doar sangue!" , nome);
			leia.close();
			return;
		}
		System.out.println("Primeira doação de sangue?  ");
		boolean primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 60 && primeiraDoacao == true) {
			System.out.printf("%s não está apto para doar sangue!" , nome);
					
		}else {
		
			System.out.printf("%s está apto para doar sangue!" , nome);
		}
		leia.close();
	}
}