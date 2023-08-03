package tela;

import classes.Conta;
import paineis.PainelCadastroCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaConta extends JFrame {

    private JMenuBar jmbBarra;
    private JMenu jmInicio, jmCadastrar;
    private JMenu jmMostrar;
    private JMenuItem jmiSair, jmiCliente, jmiMostrarDados;
    private java.util.List<Conta> conta;

    public TelaConta(String title) throws HeadlessException {
        super(title);
        this.setSize(450, 550);
        Color minhaCor = new Color(191, 169, 255);
        this.getContentPane().setBackground(minhaCor);
        this.setDefaultCloseOperation(0);
        this.iniciarComponentes();
        this.criarEventos();
    }

    private void iniciarComponentes() {
        this.jmbBarra = new JMenuBar();
        this.jmInicio = new JMenu("Indice");
        this.jmCadastrar = new JMenu("Cadastrar");
        this.jmMostrar = new JMenu("Mostrar");
        this.jmiSair = new JMenuItem("Sair");
        this.jmiCliente = new JMenuItem("Cliente");
        this.jmiMostrarDados = new JMenuItem("Mostrar Dados");
        this.setJMenuBar(this.jmbBarra);
        this.jmbBarra.add(this.jmInicio);
        this.jmInicio.add(this.jmiSair);
        this.jmbBarra.add(this.jmCadastrar);
        this.jmbBarra.add(this.jmMostrar);
        this.jmCadastrar.add(this.jmiCliente);
        this.jmMostrar.add(this.jmiMostrarDados);
    }

    private void criarEventos() {

        //criar evento do menu item
        jmiSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        jmiCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCadastroCliente contaBancaria = new PainelCadastroCliente();
                getContentPane().removeAll();//remove todos os componentes
                getContentPane().add(contaBancaria);//adiciona o painel,
                getContentPane().validate();//validar os componentes

            }
        });

        jmiMostrarDados.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        TelaConta contaBancaria = new TelaConta("Lótus");
        contaBancaria.setVisible(true);
    }
}
