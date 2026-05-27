public class App {
public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        // Adicionando informações via setters
        r1.setComprimento(10.0);
        r1.setLargura(5.0);

        // Acessando informações via getters
        System.out.println("--- Dados do Retângulo ---");
        System.out.println("Comprimento: " + r1.getComprimento());
        System.out.println("Largura: " + r1.getLargura());
        System.out.println("Área: " + r1.calcularArea());

        // Alterando informações
        System.out.println("\nAlterando dimensões...");
        r1.setComprimento(15.0);
        r1.setLargura(8.0);

        System.out.println("Nova Área: " + r1.calcularArea());
    }
}
