public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(101, "Dave Miller", 3500.00);

        System.out.println("--- Funcionário Cadastrado ---");
        System.out.println("ID: " + f1.getIdFuncionario());
        System.out.println("Nome: " + f1.getNomeFuncionario());
        System.out.println("Salário: " + f1.getSalarioFuncionario());

        f1.setIdFuncionario(102);
        f1.setNomeFuncionario("Dave MIller");

        // Exibindo dados atualizados
        System.out.println("\n--- Dados Atualizados ---");
        System.out.println("ID: " + f1.getIdFuncionario());
        System.out.println("Nome: " + f1.getNomeFuncionario());
        System.out.println("Salário: " + f1.getSalarioFuncionario());
    }
}