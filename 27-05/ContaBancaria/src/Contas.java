import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ContaPoupanca poupanca = null;
        ContaEspecial especial = null;
        
        int opcao = 0;
        
        //loop
        while (opcao != 6) {
            System.out.println("\n=== MENU DO BANCO ===");
            System.out.println("1. Incluir dados das contas");
            System.out.println("2. Sacar um valor");
            System.out.println("3. Depositar um valor");
            System.out.println("4. Render Poupança");
            System.out.println("5. Mostrar dados das contas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); //limpa o teclado

            switch (opcao) {
                case 1:
                    // 1. Incluir dados relativos a(s) conta(s) de um cliente
                    System.out.print("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();
                    
                    poupanca = new ContaPoupanca(nome, "POUP-123", 0.0, 5);
                    especial = new ContaEspecial(nome, "CHQ-456", 0.0, 500.0);
                    
                    System.out.println("Contas criadas com sucesso para " + nome + "!");
                    break;

                case 2:

                    if (poupanca == null) {
                        System.out.println("Crie as contas primeiro na opção 1!");
                        break;
                    }
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = teclado.nextDouble();
                    
                    //sacando das duas
                    poupanca.sacar(valorSaque);
                    especial.sacar(valorSaque);
                    System.out.println("Tentativa de saque realizada nas duas contas.");
                    break;

                case 3:
                    // 3. Depositar um determinado valor na(s) sua(s) conta(s)
                    if (poupanca == null) {
                        System.out.println("Crie as contas primeiro na opção 1!");
                        break;
                    }
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = teclado.nextDouble();
                    
                    poupanca.depositar(valorDeposito);
                    especial.depositar(valorDeposito);
                    System.out.println("Depósito realizado nas duas contas.");
                    break;

                case 4:
                    // 4. Mostrar o novo saldo a partir da taxa de rendimento (só poupança)
                    if (poupanca == null) {
                        System.out.println("Crie as contas primeiro na opção 1!");
                        break;
                    }
                    System.out.print("Digite a taxa de rendimento: ");
                    double taxa = teclado.nextDouble();
                    
                    poupanca.calcularNovoSaldo(taxa);
                    System.out.println("Novo saldo da Poupança: R$ " + poupanca.getSaldo());
                    break;

                case 5:
                    // 5. Mostrar os dados da(s) conta(s) de um cliente
                    if (poupanca == null) {
                        System.out.println("Nenhuma conta cadastrada.");
                        break;
                    }
                    System.out.println("\n--- DADOS DO CLIENTE ---");
                    System.out.println("Cliente: " + poupanca.cliente);
                    System.out.println("-> Conta Poupança (" + poupanca.numeroConta + ") Saldo: R$ " + poupanca.getSaldo());
                    System.out.println("-> Conta Especial (" + especial.numeroConta + ") Saldo: R$ " + especial.getSaldo() + " | Limite: R$ " + especial.limite);
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}