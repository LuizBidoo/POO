public class Data implements Comparable<Data> {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + " / " + mes + " / " + ano;
    }

    @Override
    public int compareTo(Data other) {
        // Compare the dates based on day, month, and year
        if (this.ano != other.ano) {
            return Integer.compare(this.ano, other.ano);
        }
        if (this.mes != other.mes) {
            return Integer.compare(this.mes, other.mes);
        }
        return Integer.compare(this.dia, other.dia);
    }

}

