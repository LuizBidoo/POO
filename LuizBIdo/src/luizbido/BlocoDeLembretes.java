/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luizbido;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class BlocoDeLembretes {
    private List<Lembrete> lista;
    
    public BlocoDeLembretes() {
        lista = new ArrayList<>();
    }
    
    public void inserir(Lembrete l) {
        lista.add(l);
    }
    
    public Lembrete remover(int posicao) {
        return lista.remove(posicao);
    }
    
    public Lembrete buscar(int posicao) {
        return lista.get(posicao);
    }
    
    public void ordenar() {
        Collections.sort(lista);
    }
    
    @Override
    public String toString() {
        return lista.toString();
    }
}

