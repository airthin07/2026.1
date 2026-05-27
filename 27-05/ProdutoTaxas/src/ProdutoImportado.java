public class ProdutoImportado extends ProdutoNacional {
    public double taxaImportacao = 0.15;

    public ProdutoImportado(String descricao, double valor){
        super(descricao, valor);
    }

    @Override
    public double calcularValorFinal(){
        double impostoCalcul = this.valor * this.imposto;
        double taxaCalcul = this.valor  * this.taxa;
        double taxaImportacaoCalcul = this.valor * this.taxaImportacao;
        return this.valor + taxaCalcul + impostoCalcul + taxaImportacaoCalcul;

    }

    @Override
    public void exibir(){
        System.out.println("Produto: " + this.descricao);
        System.out.println("Valor R$: " + this.valor);
        System.out.println("Valor final (importado): R$" + calcularValorFinal());
    }

}
