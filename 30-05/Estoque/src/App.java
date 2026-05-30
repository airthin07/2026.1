import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CADASTRO DE PRODUTO ===");
        System.out.print("Digite o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.print("Digite a quantidade inicial no estoque: ");
        int quantidade = teclado.nextInt();

        ProdutoEstoque prod = new ProdutoEstoque(nome, preco, quantidade);

        prod.exibirDados();

        // 2. Realizando uma entrada no estoque
        System.out.print("\nDigite a quantidade de produtos que estão ENTRANDO no estoque: ");
        int entrada = teclado.nextInt();
        prod.darEntrada(entrada);

        prod.exibirDados();

        // 3. Realizando uma saída no estoque
        System.out.print("\nDigite a quantidade de produtos que estão SAINDO do estoque: ");
        int saida = teclado.nextInt();
        prod.darSaida(saida); // <-- Corrigido: Agora o método é chamado de verdade

        prod.exibirDados();

        teclado.close();
    }
}