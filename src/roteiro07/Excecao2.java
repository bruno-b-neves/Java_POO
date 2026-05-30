package roteiro07;

import java.util.Scanner;

public class Excecao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Digite um número inteiro:");
			int numero = entrada.nextInt();
			
			int resultado = 10 / numero;
			
			System.out.println("Resultado = " + resultado);
		} catch (Exception e) {
			System.out.println("Erro");
		}
		
	}

}
