package empresa;

public class Gerente extends Funcionario {
	
	@Override
	public int calcularSalario(int a, int b) {
		int somaBase = super.calcularSalario(a, b);
		return (int) (somaBase * 1.1);
	}
	
	@Override
	public double calcularSalario(double a, double b) {
		double somaBase = super.calcularSalario(a, b);
		return somaBase * 1.1;
	}
}
