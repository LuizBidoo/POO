/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luizbido;

/**
 *
 * @author aluno
 */
public class Data {
    private final int dia;
    private final int mes;
    private final int ano;
    
    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    // Get para o dia
    public int dia() {
        return dia;
    }
    
    // Get para o mes
    public int mes() {
        return mes;
    }
    
    // Get para o ano
    public int ano() {
        return ano;
    }
    
}
