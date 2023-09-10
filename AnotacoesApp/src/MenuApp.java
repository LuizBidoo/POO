import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuApp {
    private JFrame frame;
    private JTextArea textoTitulo;
    private JTextArea textoAnotacao;
    private DefaultListModel<Anotacoes> listModel;
    private JList<Anotacoes> listaAnotacoes;

    private AnotacoesApp anotacoesApp;

    public MenuApp() {
        anotacoesApp = new AnotacoesApp();
        listModel = new DefaultListModel<>();
        listaAnotacoes = new JList<>(listModel);

        frame = new JFrame("Anotações App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel painelPrincipal = new JPanel(new BorderLayout());

        JPanel painelBotoes = new JPanel();
        JButton btnInserir = new JButton("Inserir");
        JButton btnOrdenarTitulo = new JButton("Ordenar por Título");
        JButton btnOrdenarData = new JButton("Ordenar por Data");

        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarAnotacao();
            }
        });

        btnOrdenarTitulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenarPorTitulo();
            }
        });

        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirJanelaAdicionarAnotacao();
            }
        });

        painelBotoes.add(btnInserir);
        painelBotoes.add(btnOrdenarTitulo);
        painelBotoes.add(btnOrdenarData);

        painelPrincipal.add(painelBotoes, BorderLayout.NORTH);
        painelPrincipal.add(new JScrollPane(listaAnotacoes), BorderLayout.CENTER);

        frame.add(painelPrincipal);
        frame.setVisible(true);
    }

    private void abrirJanelaAdicionarAnotacao() {
        JDialog dialog = new JDialog(frame, "Adicionar Anotação", true);
        dialog.setSize(400, 200);
        dialog.setLayout(new BorderLayout());

        JPanel painelAdicionar = new JPanel();
        painelAdicionar.setLayout(new GridLayout(2, 2));

        JTextField campoTitulo = new JTextField();
        JTextField campoAnotacao = new JTextField();

        painelAdicionar.add(new JLabel("Título:"));
        painelAdicionar.add(campoTitulo);
        painelAdicionar.add(new JLabel("Anotação:"));
        painelAdicionar.add(campoAnotacao);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenha o título e a anotação dos campos
                String titulo = campoTitulo.getText();
                String anotacao = campoAnotacao.getText();

                // Crie uma nova anotação e adicione-a à lista
                Anotacoes novaAnotacao = new Anotacoes(new Data(0, 0, 0), titulo, anotacao);
                listModel.addElement(novaAnotacao);

                // Feche o diálogo após a adição
                dialog.dispose();
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche o diálogo sem adicionar anotação
                dialog.dispose();
            }
        });

        JPanel painelBotoesDialog = new JPanel();
        painelBotoesDialog.add(btnSalvar);
        painelBotoesDialog.add(btnCancelar);

        dialog.add(painelAdicionar, BorderLayout.CENTER);
        dialog.add(painelBotoesDialog, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }

    private void adicionarAnotacao() {
        // Obtenha o título e a anotação dos campos de texto
        String titulo = textoTitulo.getText();
        String anotacao = textoAnotacao.getText();

        // Crie uma instância de Anotacoes com os valores inseridos
        Anotacoes novaAnotacao = new Anotacoes(new Data(0, 0, 0), titulo, anotacao);

        // Adicione a nova anotação à lista
        anotacoesApp.inserir(novaAnotacao);

        // Atualize a lista de anotações na interface do usuário
        listModel.addElement(novaAnotacao);

        // Limpe os campos de texto após a inserção
        textoTitulo.setText("");
        textoAnotacao.setText("");
    }

    private void ordenarPorTitulo() {
        // Ordene a lista de anotações por título
        anotacoesApp.ordenarPorTitulo();

        // Atualize a lista de anotações na interface do usuário
        atualizarListaAnotacoes();
    }

    private void ordenarPorData() {
        anotacoesApp.ordenarPorData();

        atualizarListaAnotacoes();
    }

    private void atualizarListaAnotacoes() {
        listModel.clear();

        List<Anotacoes> anotacoes = anotacoesApp.getLista();

        for (Anotacoes anotacao : anotacoes) {
            listModel.addElement(anotacao);
        }
    }
}