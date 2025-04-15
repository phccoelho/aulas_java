import java.util.Scanner;
public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0.0;
		String moeda = "";
		
		System.out.println("*************************************");
		System.out.println("        Conversor de Moedas          ");
		System.out.println("*************************************");
		System.out.println("                                     ");
		System.out.println("Converter para Dólar (US$)           ");
		System.out.println("Converter para Euros (EUR$)          ");
		System.out.println("Converter para Pesos (AR$)           ");
		System.out.println("                                     ");
		System.out.println("*************************************");
		System.out.println("Escolha a opção desejada:            ");
		
		int opcao = leia.nextInt();
		
		System.out.println("Digite o valor em Reais R$");
		double valor = leia.nextFloat();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86 ;
			moeda = "Dólar";
			break;
		case 2:
			valorConvertido = valor / 6.63 ;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049 ;
			moeda = "Peso Argentino";
			break;
		default:
			System.out.println("Opção Invalida!");
			leia.close();
			return;
		}
		
		System.out.printf("Valor convertido em %s: %.2f", moeda, valorConvertido);
		
		leia.close();

	}

}
