public class ContaBancaria {
    public String cliente;
    public String numeroConta;
    private double saldo;

    public ContaBancaria(String cliente, String numeroConta, double saldoInicial){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
    }
}
