import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo c1 = new Circulo();

        System.out.print("Digite o valor do raio do círculo: ");
        double novoRaio = scanner.nextDouble();
        
        c1.setRaio(novoRaio);
        System.out.println("\n--- Resultados do Círculo ---");
        System.out.printf("Raio: %.2f%n", c1.getRaio());
        System.out.printf("Área: %.2f%n", c1.calcularArea());
        System.out.printf("Perímetro: %.2f%n", c1.calcularPerimetro());

        scanner.close();
    }
}