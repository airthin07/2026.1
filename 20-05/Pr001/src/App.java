import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        Pessoa p1 = new Pessoa();

        System.out.println("Informações: ");
        System.out.print("Nome: ");
        p1.setNome(scanner.nextLine());
        
        System.out.print("idade: ");
        p1.setIdade(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite o país: ");
        p1.setPais(scanner.nextLine());

        System.out.println("Alterar Informações");
        System.out.print("alterar a idade? (s/n): ");
        String resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Nova idade: ");
            p1.setIdade(scanner.nextInt());
            scanner.nextLine();
        }


        System.out.println("\nDados atuais da Pessoa:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("País: " + p1.getPais());
    }
}