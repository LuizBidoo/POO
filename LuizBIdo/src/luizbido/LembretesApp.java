/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luizbido;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class LembretesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao, dia, mes, ano;
        String descricao;
        BlocoDeLembretes bloco = new BlocoDeLembretes();
        Scanner sc = new Scanner(System.in);
        do {
            opcao = menu(); // tem que ser estatico
            switch(opcao){
            case 0: 
                System.out.println("Obrigado por utilizar o app!");
                break;
            case 1:
                System.out.println("Digite um dia: ");
                dia = sc.nextInt();
                System.out.println("Digite um mes: ");
                mes = sc.nextInt();
                System.out.println("Digite um ano: ");
                ano = sc.nextInt();
                Data d = new Data(dia, mes, ano);
                System.out.println("Digite uma descrição: ");
                sc.nextLine(); // pra limpar o buffer
                descricao = sc.next(); // pra limpar o buffer
                Lembrete l = new Lembrete(descricao, d);
                BlocoDeLembretes.inserir(l);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
    }
    
    private static int menu() {
    int opcao = 0;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Menu bloco de lembretes");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Inserir");
        System.out.println("2 - Excluir por indice");
        System.out.println("3 - Buscar por substring");
        System.out.println("4 - Buscar por mês");
        System.out.println("5 - Buscar por dia");
        System.out.println("6 - Imprimir");
        System.out.println("7 - Imprimir por mês");
        System.out.println("8 - Imprimir por dia");
        System.out.println("0 - Sair");
        opcao = sc.nextInt();
        sc.nextLine();
    } while(opcao < 0 && opcao > 8);
    return opcao;
    }    
}   