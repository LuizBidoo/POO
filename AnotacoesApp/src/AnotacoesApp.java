import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class AnotacoesApp {
    private List<Anotacoes> lista;

    public AnotacoesApp() {
        lista = new ArrayList<>();
    }

    public List<Anotacoes> getLista() {
        return lista;
    }

    public void inserir(Anotacoes a) {
        lista.add(a);
    }

    public Anotacoes remover(int posicao) {
        return lista.remove(posicao);
    }

    public void editaTitulo(int indice, String novoTitulo) {
        if (indice >= 0 && indice <= lista.size()) {
            Anotacoes anotacao = lista.get(indice); // buscando anotação
            anotacao.setTitulo(novoTitulo);
        } else {
            System.out.println("Não existe essa anotação");
        }
    }

    public void editaAnotacao(int indice, String novaAnotacao) {
        if (indice >= 0 && indice <= lista.size()) {
            Anotacoes anotacao = lista.get(indice); // buscando anotação
            anotacao.setAnotacao(novaAnotacao);
        } else {
            System.out.println("Não existe essa anotação");
        }
    }

    public void ordenarPorData() {
        Collections.sort(lista);
    }

    public void ordenarPorTitulo() {
        Collections.sort(lista, new ComparaPorTitulo());
    }
}
