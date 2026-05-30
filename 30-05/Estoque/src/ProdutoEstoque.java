public class ProdutoEstoque {
    public String nome;
    public double preco;
    public int quantidade;

    public ProdutoEstoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public void darEntrada(int qtdeEntrada){
        this.quantidade = this.quantidade + qtdeEntrada;
    }

    public boolean darSaida(int qtdeSaida){
        if(qtdeSaida > this.quantidade){
            System.out.println("Quantidade informada (" + qtdeSaida + ") excede a disponibilidade de (" + this.quantidade + ")"); // <-- Fechei o parêntese do texto aqui
            return false;
        } else {
            this.quantidade = this.quantidade - qtdeSaida;
            return true;
        }
    }

    public void exibirDados(){
        System.out.println("\nDados do produto:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        // Corrigido: Ajustado para chamar valorTotalEstoque() que é o nome real do seu método
        System.out.println("Valor Total no Estoque: R$ " + valorTotalEstoque()); 
    }
} // <-- Removida a chave extra que estava quebrando o código