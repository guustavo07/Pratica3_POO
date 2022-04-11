package questão3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String placa;
		int ano, options, eixos, assentos;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a placa do veículo: ");
		placa = ler.nextLine();
		System.out.println("Informe o ano do veículo: ");
		ano = ler.nextInt();
		
		System.out.println("Escolha qual o tipo de veículo: \n1 - Caminhão \n2 - Ônibus");
		options = ler.nextInt();
		switch(options) {
		case 1:
			System.out.println("Informe a quantidade de eixos: ");
			eixos = ler.nextInt();
			Caminhao c1 = new Caminhao(placa, ano, eixos);
			c1.exibirDados();
			break;
		case 2:
			System.out.println("Informe a quantidade de assentos: ");
			assentos = ler.nextInt();
			Onibus o1 = new Onibus(placa, ano, assentos);
			o1.exibirDados();
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
}
