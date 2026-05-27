public class Peca {
    public String nome;
    public float custo;
    public float lucro;

    public Peca(){
        // construtor vazio
    }

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro; // <--- Faltava o ponto e vírgula aqui!
    }

    // calcular preço padrao
    public float calcularPreco(){
        return this.custo + this.lucro;
    }

    // dados na tela
    public void exibir(){
        System.out.println("Peça: " + this.nome); // <--- Tirei o R$ daqui porque o nome é texto
        System.out.println("Custo: R$ " + this.custo);
        System.out.println("Lucro: R$ " + this.lucro);
        System.out.println("Preço: R$ " + calcularPreco());
    }
}