import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do colaborador: ");
		String colaborador = leia.next();
		System.out.println("Código do cargo (1 a 6): ");
		int codigoCargo = leia.nextInt();
		System.out.println("Salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Nome do colaborador: " + colaborador);
		
		switch(codigoCargo){
		case 1:
			System.out.println("Cargo: Gerente");
			salario = salario * 1.1f;
			System.out.println("Salário: R$" + salario);
			break;
		case 2:
			System.out.println("Cargo: Vendedor");
			salario = salario * 1.07f;
			System.out.println("Salário: R$" + salario);
			break;
		case 3:
			System.out.println("Cargo: Supervisor");
			salario = salario * 1.09f;
			System.out.println("Salário: R$" + salario);
			break;
		case 4:
			System.out.println("Cargo: Motorista");
			salario = salario * 1.06f;
			System.out.println("Salário: R$" + salario);
			break;
		case 5:
			System.out.println("Cargo: Estoquista");
			salario = salario * 1.05f;
			System.out.println("Salário: R$" + salario);
			break;
		case 6:
			System.out.println("Cargo: Tecnico de Ti");
			salario = salario * 1.08f;
			System.out.println("Salário: R$" + salario);
			break;
		}
		
		leia.close();
	}

}
