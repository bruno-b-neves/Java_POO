package empresa;

abstract class Funcionario {
	static double salarioBase = 0; 
	
	abstract int calcularSalario(int a, int b);
	
	abstract double calcularSalario(double a, double b);
}
