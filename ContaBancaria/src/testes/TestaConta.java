package testes;

import classes.Conta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        //O NEW CRIA O OBJETO DENTRO DA LISTA DE CONTA
        contas.add(new Conta(0001, "\nJosenildo", 200.00, 1200.00));
        contas.get(0).sacaDinheiro(200);
        contas.get(0).depositaDinheiro(50);
        System.out.println(contas.get(0).mostrarDados());

        String[] menu = {"Cadastrar", "Sacar", "Depositar", "Transferir", "Mostrar", "Sair"};
        String opcao;
        do {
            opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção",
                    "Conta bancária", JOptionPane.INFORMATION_MESSAGE, null, menu, "Cadatrar").toString();
            switch (opcao) {
                case "Cadastrar":
                    contas.add(new Conta(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da conta")),
                            JOptionPane.showInputDialog("Entre com o titular da conta"),
                            Double.parseDouble(JOptionPane.showInputDialog("Entre com o saldo inical da conta"))
                            , Double.parseDouble(JOptionPane.showInputDialog("Entre com o limite da conta"))));
                    break;
                case "Sacar":
                    int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Entre ccm o numero da conta"));
                    for (Conta conta : contas) {
                        if (conta.numero == numeroConta) {
                            String resposta = conta.sacaDinheiro(Integer.parseInt(JOptionPane.showInputDialog
                                    ("Entre com o valor a ser sacado"))) ? "Saque com sucesso" : "Saldo Insuficiente";
                            JOptionPane.showMessageDialog(null, resposta);

                        }

                    }
                    break;
                case "Depositar":
                    int numeroDaConta = Integer.parseInt(JOptionPane.showInputDialog("Entre ccm o numero da conta"));
                    for (Conta conta : contas) {
                        if (conta.numero == numeroDaConta) {
                            String resposta = conta.depositaDinheiro(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor a ser sacado"))) ?
                                    "Saque com sucesso" : "Saldo Insuficiente";
                            JOptionPane.showMessageDialog(null, resposta);
                        }
                    }
                    break;
                case "Transerir":
                    break;
                case "Mostrar":
                    for (Conta conta : contas) {
                        System.out.println(conta.mostrarDados());
                    }

                    break;
                default:
                    break;

            }
        } while (!opcao.equals("Sair"));

        Conta conta = new Conta(1, "Lidia", 200.00, 1200.00);
        Conta conta2 = new Conta(2, "Eloah", 2000.00, 5000.00);
        conta2.trasfereDinheiro(conta, 500.00);
        conta.sacaDinheiro(100.00);
        conta.depositaDinheiro(50.00);

        System.out.println("Eloah:  " + conta.saldo + "\nLidia:  " + conta2.saldo);

    }

}