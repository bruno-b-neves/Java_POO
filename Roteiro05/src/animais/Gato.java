package animais;

public class Gato extends Animal {
	
	// Tempo de execução - (Sobrescrita)
	@Override
	public void emitirSom() {
		System.out.println("Miado");
	}
}
