// Classe abstrata Conta
public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}

// Classe ContaCorrente
public class ContaCorrente extends Conta {
    public ContaCorrente(String numero) {
        super(numero);
    }

    // Métodos específicos da ContaCorrente podem ser adicionados aqui
}

// Classe ContaPoupanca
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero) {
        super(numero);
    }

    // Métodos específicos da ContaPoupanca podem ser adicionados aqui
}
