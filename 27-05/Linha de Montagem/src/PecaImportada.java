public class PecaImportada extends Peca {

    public float taxaImportacao;
    public float taxaFrete;

    public PecaImportada(){
        super();
    }

    //todos dados
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete){
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco(){
        return super.calcularPreco() + this.taxaImportacao + this.taxaFrete;
        //super.calcularPreco() pega o preço calculado na classe Peca e soma as taxas de importacao e frete
    }

    @Override
    public void exibir(){
        super.exibir();//chama o metodo exibir da classe Peca para mostrar os dados basicos da peça
        System.out.println("Taxa de importação: R$ " + this.taxaImportacao);
        System.out.println("Taxa de Frete: R$ " + this.taxaFrete);
        System.out.println("Preço final (taxas): R$ " + calcularPreco());
    }
}
