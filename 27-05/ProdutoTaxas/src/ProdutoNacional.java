public class ProdutoNacional extends Produto {
    public double taxa = 0.05;

    public ProdutoNacional (String descricao, double valor){
        super(descricao, valor);
    }

    @Override
    public void exibir(){
        System.out.println("Produto: " + this.descricao);
        System.out.println("Valor R$: " + this.valor);
        System.out.println("Valor final (nacional): R$ " + calcularValorFinal());

}}
