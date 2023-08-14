/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luizbido;

/**
 *
 * @author aluno
 */
public class Lembrete implements Comparable<Lembrete> {
    
    private String descricao;
    // Devera ser expandido para uma data completa;
    // utilizar a classe Data do cadastro de pessoas;
    private Data data; 
    
    public Lembrete(String descricao, Data data) {
        this.descricao = descricao;
        this.data = data;
    }
    
    @Override
    public String toString() {
        return data + " - " + descricao + "\n";
    }

    @Override
    public int compareTo(Lembrete l) {
        //return this.descricao.compareTo(l.descricao);
        return this.data - l.data;
    }
}
