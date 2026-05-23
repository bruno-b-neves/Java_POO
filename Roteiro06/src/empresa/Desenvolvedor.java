package empresa;

public class Desenvolvedor extends Funcionario {

	@Override
	public int calcularSalario(int a, int b) {
		return a + b;
	}

	@Override
	public double calcularSalario(double a, double b) {
		
		return a + b;
	}
}
