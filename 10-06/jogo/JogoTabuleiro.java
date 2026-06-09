package classeAbstrata;

import java.util.Random;

public class JogoTabuleiro extends Jogo {
    private String tipoTabuleiro;
    
    public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro) {
        super(nome, numeroJogadores);
        this.tipoTabuleiro = tipoTabuleiro;
    }
    
    @Override
    public void iniciar() {
        System.out.println("Jogo de tabuleiro: " + super.nome + " começou");
        
        int posicaoJogador1 = 0, posicaoJogador2 = 0, posicaoJogador3 = 0, posicaoJogador4 = 0;
        int metaTabuleiro = 30, rodadas = 0, vencedor = 0;
        
        Random dado = new Random();
        boolean jogoAtivo = true;

        System.out.println("Corrida de tabuleiro de " + metaTabuleiro + " casas");

        while(jogoAtivo) {
            rodadas++;
            System.out.println("\nRodada " + rodadas);

            // Jogador 1
            int valorDado = dado.nextInt(6) + 1;
            posicaoJogador1 += valorDado;
            System.out.println("Jogador 1 tirou " + valorDado + " e foi para " + posicaoJogador1);
            if(posicaoJogador1 >= metaTabuleiro) { vencedor = 1; jogoAtivo = false; break; }

            // Jogador 2
            valorDado = dado.nextInt(6) + 1; // Sem o 'int' aqui, pois a variável já existe
            posicaoJogador2 += valorDado;
            System.out.println("Jogador 2 tirou " + valorDado + " e foi para " + posicaoJogador2);
            if(posicaoJogador2 >= metaTabuleiro) { vencedor = 2; jogoAtivo = false; break; }

            // Jogador 3
            if (super.numeroJogadores >= 3) {
                valorDado = dado.nextInt(6) + 1;
                posicaoJogador3 += valorDado;
                System.out.println("Jogador 3 tirou " + valorDado + " e foi para " + posicaoJogador3);
                if(posicaoJogador3 >= metaTabuleiro) { vencedor = 3; jogoAtivo = false; break; }
            }

            // Jogador 4
            if (super.numeroJogadores >= 4) {
                valorDado = dado.nextInt(6) + 1;
                posicaoJogador4 += valorDado;
                System.out.println("Jogador 4 tirou " + valorDado + " e foi para " + posicaoJogador4);
                if(posicaoJogador4 >= metaTabuleiro) { vencedor = 4; jogoAtivo = false; break; }
            }
        }
        System.out.println("\nO jogador " + vencedor + " venceu!");
    }
    
    @Override
    public void exibirRegras() {
        System.out.println("Cada jogador deve mover suas peças no tabuleiro");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Tipo tabuleiro: " + tipoTabuleiro;
    }
}