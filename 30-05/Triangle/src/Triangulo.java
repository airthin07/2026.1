public class Triangulo {
    public double a;
    public double b;
    public double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularArea() {
        // p é o semiperímetro da fórmula
        double p = (this.a + this.b + this.c) / 2;
        
        // Aqui usamos Math.sqrt para raiz quadrada
        double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p + this.c));
        return area;
    }
}