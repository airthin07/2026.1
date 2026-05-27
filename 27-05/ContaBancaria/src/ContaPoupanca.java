public class ContaPoupanca extends ContaBancaria{
    public int diaRendimento;

    public ContaPoupanca(String cliente, String numeroConta, double saldoInicial, int diaRendimento){
       super(cliente, numeroConta, saldoInicial);
       this.diaRendimento = diaRendimento; 
    }

    //novo metodo
    public void calcularNovoSaldo(double taxaRendimento){
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}
