package classeAbstrata;

import java.util.Random; // <-- Faltava esse import

public class JogoCartas extends Jogo {
    private String tipoBaralho;
    
    public JogoCartas(String nome, int numeroJogadores, String tipoBaralho) {
        super(nome, numeroJogadores);
        this.tipoBaralho = tipoBaralho;
    }
    
    @Override
    public void iniciar() {
        System.out.println("O jogo de cartas " + nome + " começou");
        System.out.println("Tipo de baralho escolhido: " + this.tipoBaralho);

        if(super.numeroJogadores < 2 || super.numeroJogadores > 6){
            System.out.println("O jogo " + nome + " deve ter entre 2 e 6 jogadores");
            return; 
        }
        System.out.println("Quantia de jogadores: " + super.numeroJogadores);

        int totalCartas = 52;
        int cartasPorJogador = 7;
        int cartasDistribuidas = super.numeroJogadores * cartasPorJogador;

        System.out.println("Distribuindo " + cartasPorJogador + " cartas para cada um dos " + super.numeroJogadores + " jogadores");

        int cartasRestantes = totalCartas - cartasDistribuidas;
        System.out.println("Existem " + cartasRestantes + " cartas restantes no baralho");

        Random gerador = new Random();
        int numeroVencedor = gerador.nextInt(super.numeroJogadores) + 1;
        System.out.println("O vencedor do jogo " + nome + " é o jogador numero " + numeroVencedor);
    }
    
    @Override
    public void exibirRegras() {
        System.out.println("Cada jogador deve jogar uma carta por vez");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Tipo baralho: " + tipoBaralho;
    }
}