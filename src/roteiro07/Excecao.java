package roteiro07;

import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = entrada.nextInt();
		
		int resultado = 10 / numero;
		
		System.out.println("Resultado = " + resultado);
		
	}

}
