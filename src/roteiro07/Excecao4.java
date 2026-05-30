package roteiro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);


		try {
			
			System.out.println("Digite um número inteiro:");
			int numero = entrada.nextInt();
			
			int resultado = 10 / numero;
			
			System.out.println("Resultado = " + resultado);
			
			Teste t1 = null;
			t1.x = 10;
			
		} catch (InputMismatchException e) {
			
			System.out.println("Número INTEIRO digitado incorreto");
			
		} catch (ArithmeticException e) {
			
			System.out.println("Erro de divisão por zero");
			
		} catch (NullPointerException e) {
			
			System.out.println("Objeto Teste não foi criado");
			
		} 
		
	}

}
