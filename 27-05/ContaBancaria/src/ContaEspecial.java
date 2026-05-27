public class ContaEspecial extends ContaBancaria {
    public double limite; //novo atributo

    public ContaEspecial(String cliente, String numeroConta, double saldoInicial, double limite){
        super(cliente, numeroConta, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor <= (getSaldo() + this.limite)){
            if (valor <= (getSaldo() + this.limite)){
                depositar(-valor);
            }
        }
    }
}
