package classeAbstrata;

public class Principal {

    public static void main(String[] args) {
        
        // 1. Criando e testando o Jogo de Tabuleiro
        Jogo jogoTabuleiro = new JogoTabuleiro("Banco Imobiliário", 3, "Quadrado");
        System.out.println(jogoTabuleiro.toString());
        jogoTabuleiro.exibirRegras();
        jogoTabuleiro.iniciar();
        
        System.out.println("\n--------------------------------------------------");
        
        // 2. Criando e testando o Jogo de Cartas
        Jogo jogoCarta = new JogoCartas("Uno", 4, "Colorido Personalizado");
        System.out.println(jogoCarta.toString());
        jogoCarta.exibirRegras();
        jogoCarta.iniciar();
    }
}