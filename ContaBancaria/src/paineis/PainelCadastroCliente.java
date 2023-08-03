package paineis;

import classes.Conta;
import tela.TelaConta;

import javax.swing.*;
import java.awt.*;
import java.util.List;
public class PainelCadastroCliente extends JPanel {
    private JLabel jLNome, jlNConta, jlSaldo, jlLimite;
    private JTextField jtfNome, jtfNConta, jtfSaldo, jtfLimite;
    private JButton jbCadastrar;

    private void iniciarComponentes() {

        jLNome = new JLabel("Nome");
        jtfNome = new JTextField();

        jlNConta = new JLabel("N° Conta");
        jtfNConta = new JPasswordField();

        jlSaldo = new JLabel("Saldo");
        jtfSaldo = new JTextField();

        jlLimite = new JLabel("Limite");
        jtfLimite = new JPasswordField();

        jbCadastrar = new JButton("Cadastrar");
        jbCadastrar.setBackground(new Color(191,169,105));

        //adcionar
        add(jLNome);
        add(jtfNome);
        add(jlNConta);
        add(jtfNConta);
        add(jlSaldo);
        add(jtfSaldo);
        add(jlLimite);
        add(jtfLimite);
        add(jbCadastrar);

        //dimensionar
        jLNome.setBounds(20, 15, 100, 50);
        jtfNome.setBounds(20, 35, 210, 23);

        jlNConta.setBounds(20, 55, 100, 50);
        jtfNConta.setBounds(20, 75, 210, 23);

        jlSaldo.setBounds(20, 95, 100, 50);
        jtfSaldo.setBounds(20, 105, 210, 23);

        jlLimite.setBounds(20, 125, 100, 50);
        jtfLimite.setBounds(20, 150  , 210, 23);

        jbCadastrar.setBounds(20, 195, 160, 30);

    }
    private void criarEventos() {

    }
    public static void main(String[] args) {
       PainelCadastroCliente contaBancaria = new PainelCadastroCliente();
        contaBancaria.setVisible(true);
    }
}
