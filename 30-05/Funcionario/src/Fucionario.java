public class Fucionario {
    public String nome;
    public double salario;

    public Fucionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularNovoSalario() {
        if (this.salario >= 1 && this.salario <= 1000) {
            return this.salario + (this.salario * 0.15);
        } else if (this.salario >= 1001 && this.salario <= 1500) {
            return this.salario + (this.salario * 0.10);
        } else if (this.salario >= 1501 && this.salario <= 2000) {
            return this.salario + (this.salario * 0.05);
        }
        return this.salario;
    }

    public void mostrarResultados() {
        System.out.println("\n--- RESULTADO DO AUMENTO ---");
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário Antigo: R$ " + this.salario);
        System.out.println("Salário Atual: R$ " + calcularNovoSalario());
    }
}
