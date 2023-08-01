import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BlocoDeLembretes bloco = new BlocoDeLembretes();

        Lembrete l1 = new Lembrete("Kung fu as 13");

        Lembrete l2 = new Lembrete("Levar a vó na natação");

        Lembrete l3 = new Lembrete("Lavar o pé do meu urso");

        bloco.inserir(l1);
        bloco.inserir(l2);
        bloco.inserir(l3);

        //Lembrete excluido = bloco.removePorIndice(0);
        //System.out.println("Lembrete excluído: " + excluido);

        bloco.ordenar();

        System.out.println(bloco);


    }
}