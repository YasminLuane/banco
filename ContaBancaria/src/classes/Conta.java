package classes;

public class Conta {
    //ATRIBUTOS
    public int numero;
    public String cliente;
    public double saldo;
    public double limite;

    //CONSTRUTOR
    public Conta(int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    //SACA DINHEIRO DA CONTA
    public boolean sacaDinheiro(double quantidade) {
        if (saldo + limite >= quantidade) {
            saldo -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    //DEPOSITA DINHEIRO NA CONTA
    public boolean depositaDinheiro(double quantidade) {
        saldo += quantidade;
        return false;
    }

    //TRANSFERE DINHEIRO DE UMA CONTA PARA OUTRA
    public boolean trasfereDinheiro(Conta destino, double quantidade) {
        if (sacaDinheiro(quantidade)) {
            destino.depositaDinheiro(quantidade);
            return true;
        }
        else {
            return false;
        }

        }
        public String mostrarDados (){
        return "Cliente:" + cliente + "\nSaldo:" + saldo + "\nLimite:" + limite + "\nNumero da conta:" + numero;

        }
    }


