public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto("Produto A", 100.0);
        ProdutoNacional produto2 = new ProdutoNacional ("Produto B", 200.0);
        ProdutoImportado produto3 = new ProdutoImportado("Produto C", 300.0);

        System.out.println("Produto Estadual: ");
        produto1.exibir();
        System.out.println("\nProduto Naciona: ");
        produto2.exibir();
        System.out.println("\nProduto Importado: ");
        produto3.exibir();
    }
    
}
