public class Produto {
    public String descricao;
    public double valor;
    public double imposto = 0.10;

    public Produto(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    //metodo pra calcular valor final (estadual)
    public double calcularValorFinal(){
        return this.valor + (this.valor * this.imposto);
    }

    public void exibir(){
        System.out.println("Produto: " + this.descricao);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Valor final (estadual): R$ " + calcularValorFinal());
}
}
