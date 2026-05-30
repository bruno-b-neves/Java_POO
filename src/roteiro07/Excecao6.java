package roteiro07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao6 {
	
	public static void verificarDenominador(int denominador) throws Exception {
		
		if  (denominador == 0) {
			throw new Exception("Denominador igual a zero! Divisão impossível");
		}

	}

	public static void main(String[] args) throws Exception {
		
		Scanner entrada = new Scanner(System.in);


		try {
			
			System.out.println("Digite um número inteiro:");
			int numero = entrada.nextInt();
			
			verificarDenominador(numero);
			
			int resultado = 10 / numero;
			
			System.out.println("Resultado = " + resultado);
			
			Teste t1 = new Teste(); // null
			t1.x = 10;
			
			// Exception deve sempre ser o útimo catch
			// da sequencia de excessões
			
		} catch (InputMismatchException e) {
			
			System.out.println("Número INTEIRO digitado incorreto");
			
		} catch (ArithmeticException e) {
			
			System.out.println("Erro de divisão por zero");
			e.printStackTrace(); // põe no log de erros
			
		} catch (NullPointerException e) {
			
			System.out.println("Objeto Teste não foi criado");
			
		} // catch (Exception e) {
			
			// System.out.println("Erro ocorrido no geral...");
			
		// }
		finally {
			
			System.out.println("... executando o finally do tratamento");
			// para liberar RECURSOS (BD, rede, internet, arquivo e etc)
			
		}
		
	}
	

}
