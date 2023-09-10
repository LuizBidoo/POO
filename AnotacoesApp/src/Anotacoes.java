public class Anotacoes implements Comparable<Anotacoes>{
    private Data data;
    private String titulo;
    private String anotacao;

    public Anotacoes(Data data, String titulo, String anotacao) {
        this.data = data;
        this.titulo = titulo;
        this.anotacao = anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Data getData() {
        return data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnotacao() {
        return anotacao;
    }

    @Override
    public int compareTo(Anotacoes a) {
        return this.data.compareTo(a.data);
    }

    @Override
    public String toString() {
        return titulo; // Retorna apenas o título da anotação
    }
}
