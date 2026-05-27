public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;
    private String pais;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.pais = pais;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}