package roteiro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);


		try {
			System.out.println("Digite um número inteiro:");
			int numero = entrada.nextInt();
			
			int resultado = 10 / numero;
			
			System.out.println("Resultado = " + resultado);
		} catch (InputMismatchException e) {
			System.out.println("Número INTEIRO digitado incorreto");
		} 
		
	}

}
