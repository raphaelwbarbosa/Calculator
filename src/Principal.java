import java.util.Scanner;
import java.lang.Math;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Este programa realiza a fun��o de calculadora");

		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 - For�a Centr�peta");
		System.out.println("2 - For�a El�stica");
		System.out.println("3 -  For�a Peso");
		System.out.println("4 � Impulso");
		System.out.println("5 - MRU");
		System.out.println("6 - MRUV");
		System.out.println("7 -  Velocidade M�dia");
		System.out.println("0 - Sair do Programa");

		double op = ler.nextInt();
		double n1, n2, n3;
		 
		if (op == 1) {
			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();

			System.out.println("Digite o terceiro n�mero");
			n3 = ler.nextInt();
			System.out.println("Resultado For�a Centr�peta: " + n1 * ((float) Math.pow(n2, 2) / n3));
		}

		else if (op == 2) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();
			System.out.println("Resultado For�a El�stica: " + n1 * n2);
		} else if (op == 3) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();
			System.out.println("Resultado For�a Peso: " + n1 * n2);
		} else if (op == 4) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();
			System.out.println("Resultado Impulso: " + n1 * n2);
		} else if (op == 5) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();

			System.out.println("Digite o terceiro n�mero");
			n3 = ler.nextInt();
			System.out.println("Resultado MRU: " + n1 + (n2 * n3));
		} else if (op == 6) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();
			System.out.println("Resultado MRUV: " + n1 / n2);
		} else if (op == 7) {

			System.out.println("Digite o Primeiro N�mero:");
			n1 = ler.nextInt();

			System.out.println("Digite o Segundo N�mero:");
			n2 = ler.nextInt();
			System.out.println("Resultado Velocidade M�dia: " + n1 / n2);
		} else if (op == 0) {
			ler.close();
			System.out.println("At� a pr�xima!");
		}
	}

}
