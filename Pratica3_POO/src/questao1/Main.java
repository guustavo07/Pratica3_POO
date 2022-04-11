package questao1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int options;
		double valInicial = 80;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha seu ingresso: \n1 - Ingresso Normal \n2 - Ingresso Vip \n3 - Ingresso Camarote \n4 - Sair");
		options = ler.nextInt();
		switch(options){
		case 1:
		    Normal valNormal = new Normal(valInicial);
            valNormal.imprimeIngresso();
            System.out.println("----------------------------------------------------------------");
            break;
		case 2:
		    Vip valorVip = new Vip(valInicial,20);
            valorVip.imprimeIngresso();
            System.out.println("----------------------------------------------------------------");
            break;
		case 3:
		    Camarote valCamarote = new Camarote(valInicial, "Portão B", 50);
            valCamarote.ingressoDoCamarote();
            System.out.println("----------------------------------------------------------------");
            break;
		case 4:
		    break;
		    default:
		    System.out.println("Opção Inválida!");
		    System.out.println("----------------------------------------------------------------");
		}
		}
	}
