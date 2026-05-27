import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
    // Atributos privados
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;

    // Construtor: como não temos setter para salário, 
    // ele precisa ser definido aqui na criação.
    public Funcionario(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    // Getters e Setters para ID
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    // Getters e Setters para Nome
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    // Apenas Getter para salário (formatado)
    public String getSalarioFuncionario() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoMoeda.format(this.salarioFuncionario);
    }
}