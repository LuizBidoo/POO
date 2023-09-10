import java.util.Comparator;

public class ComparaPorTitulo implements Comparator<Anotacoes> {
    @Override
    public int compare(Anotacoes a1, Anotacoes a2) { // recebe como parametro duas instancias de anotação
        return a1.getTitulo().compareTo(a2.getTitulo()); // da get titulo na primeira e compara com get titulo da segunda
    }
}
