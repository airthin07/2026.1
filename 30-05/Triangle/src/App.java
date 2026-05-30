import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lendo o Triângulo X
        System.out.println("Digite os três lados do triângulo X:");
        double xA = teclado.nextDouble();
        double xB = teclado.nextDouble();
        double xC = teclado.nextDouble();
        Triangulo x = new Triangulo(xA, xB, xC);

        // Lendo o Triângulo Y
        System.out.println("Digite os três lados do triângulo Y:");
        double yA = teclado.nextDouble();
        double yB = teclado.nextDouble();
        double yC = teclado.nextDouble();
        Triangulo y = new Triangulo(yA, yB, yC);

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.println("\nÁrea do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        // Verificando qual é o maior
        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y possui a maior área.");
        } else {
            System.out.println("Os dois possuem áreas iguais.");
        }

        teclado.close();
    }
}