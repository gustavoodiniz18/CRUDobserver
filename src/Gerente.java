public class Gerente {
    private String nome;
    private String cargo;

    public Gerente(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
