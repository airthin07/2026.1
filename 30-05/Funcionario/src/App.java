import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o salário atual do funcionário: ");
        double salario = teclado.nextDouble();

        Fucionario func = new Fucionario(nome, salario);

        func.mostrarResultados();

        teclado.close();
    }
}