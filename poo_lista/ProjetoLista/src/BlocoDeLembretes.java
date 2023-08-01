import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BlocoDeLembretes {
    private List<Lembrete> lista; // declaramos a lista como do tipo List

    // list é uma interface (classes abstratas também não podem)
    // portanto não pode ser instanciado
    // então teremos que usar uma implementação da list, nesse
    // caso uma linked list (linked list herda de lista, então
    // podemos declarar o atributo lista como list e instanciar
    // linked list).
    public BlocoDeLembretes() {
        lista = new LinkedList();
    }

    public void inserir(Lembrete l) {
        lista.add(l);
    }

    public Lembrete removePorIndice(int index) {
        return lista.remove(index); // precisa retornar a referencia para o elemento que está sendo excluido
    }

    public void ordenar() {
        Collections.sort(lista);
    }

    @Override
    public String toString() {
        return "Descrição: " + lista.toString(); // Chamando to string para lista
    }
}
