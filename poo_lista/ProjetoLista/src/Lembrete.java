import java.util.Collections;

public class Lembrete implements Comparable<Lembrete>{
    private String descricao;

    public Lembrete(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    @Override
    public int compareTo(Lembrete l) {
        return this.descricao.compareTo(l.descricao);
    }
}
