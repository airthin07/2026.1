public class Retangulo {
  
    private double comprimento;
    private double largura;


    public Retangulo() {
    }

    // Construtor com parâmetros
    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public double calcularArea() {  //demonstrar usp
        return comprimento * largura;
    }
}