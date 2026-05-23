package empresa;

public class Gerente extends Funcionario {
	final double BONUS = 1.1;
	
	@Override
	public int calcularSalario(int a, int b) {
		Funcionario.salarioBase = a + b;
		return (int) (salarioBase * BONUS);
	}
	
	@Override
	public double calcularSalario(double a, double b) {
		Funcionario.salarioBase = a + b;
		return salarioBase * BONUS;
	}
}
