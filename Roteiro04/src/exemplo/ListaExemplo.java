package exemplo;

// Import da classe ArrayList para usar listas dinâmicas
import java.util.ArrayList;

// Import da classe LinkedList para usar listas encadeadas
import java.util.Vector;

// Import da classe List para usar a interface de listas
import java.util.List;

public class ListaExemplo {
    public static void main(String[] args) {
        // Criação de uma lista de strings usando ArrayList
        List<String> listaNomes = new ArrayList<>();

        // Adição de elementos à lista
        listaNomes.add("Bruno");
        listaNomes.add("Caroline");
        listaNomes.add("Antonella");
        listaNomes.add("Ian");
        listaNomes.add("Henry");

        // Exibição da lista de nomes
        System.out.println("ArrayList inicial: " + listaNomes);

        // Criação de um vetor de inteiros usando Vector (O Thread-Safe)
        Vector<Integer> vetorNumeros = new Vector<>();

        // Adição de elementos ao vetor
        vetorNumeros.add(10);
        vetorNumeros.add(20);

        // Exibição do vetor de números 
        System.out.println("Vector inicial: " + vetorNumeros);


        // Modificação e remoção de elementos na lista
        listaNomes.set(1, "João Silva"); // Substitui "Caroline" por "João Silva"
        listaNomes.remove(2); // Remove "Antonella" da lista

        // Exibição da lista após as alterações
        System.out.println("ArrayList após alterações: " + listaNomes);

        // Exibição do tamanho da lista
        System.out.println("Tamanho atual da lista: " + listaNomes.size());
    }
}
