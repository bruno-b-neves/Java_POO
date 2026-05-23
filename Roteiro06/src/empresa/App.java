package empresa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Desenvolvedor();
		// Funcionario f3 = new Funcionario(); // Classe abstrata - erro de compilação
		
		double resultadoSalario = f1.calcularSalario(400, 800);
		System.out.println("Salário do Gerente: " + resultadoSalario);
		
		double resultadoSalarioDev = f2.calcularSalario(1200, 1200);
		System.out.println("Salario Desenvolvedor: " + resultadoSalarioDev);
		
		ArrayList<Funcionario> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		// lista.add(f3); 
		
		for (Funcionario f : lista) {
			if (f instanceof Gerente) {
				double resultado = f.calcularSalario(2000, 2000);
				System.out.println("Salário calculado do gerente: " + resultado);				
			} else if (f instanceof Desenvolvedor) {
				double resultado = f.calcularSalario(2000, 2000);
				System.out.println("Salário calculado do desenvolvedor: " + resultado);
			} else {
				double resultado = f.calcularSalario(1600, 1600);
		        System.out.println("Salário calculado do funcionário: " + resultado);
		    }
		}
		
		int opcFunc = 0;
		
		do {
			System.out.println("1. Calcular Salário Gerente");
			System.out.println("2. Calcular Salário Desenvolvedor");
			System.out.println("3. Calcular Salário Funcionário");
			System.out.println("0. Para encerrar o sistema");
			
			opcFunc = entrada.nextInt();
			double dia5;
			double dia20;
			double resultado;
			
			switch (opcFunc) {
				case 1:
					System.out.println("Digite o salário do dia 5: ");
					dia5 = entrada.nextDouble();
					
					System.out.println("Digite o salário do dia 20: ");
					dia20 = entrada.nextDouble();
					
					entrada.nextLine();
					
					resultado = lista.get(0).calcularSalario(dia5, dia20);
					System.out.println("Salário calculado: " + resultado);

					break;
				case 2: {
					System.out.println("Digite o salário do dia 5: ");
					dia5 = entrada.nextDouble();
					
					System.out.println("Digite o salário do dia 20: ");
					dia20 = entrada.nextDouble();
					
					entrada.nextLine();
					
					resultado = lista.get(1).calcularSalario(dia5, dia20);
					System.out.println("Salário calculado: " + resultado);

					break;
				}
				case 3: {
					System.out.println("Digite o salário do dia 5: ");
					dia5 = entrada.nextDouble();
					
					System.out.println("Digite o salário do dia 20: ");
					dia20 = entrada.nextDouble();
					
					entrada.nextLine();
					
					resultado = lista.get(2).calcularSalario(dia5, dia20);
					System.out.println("Salário calculado: " + resultado);

					break;
				}
				
				default: {
					System.out.println("Saindo do sistema...");
					break;
				}
			}
			
		} while (opcFunc != 0);
	}

}
