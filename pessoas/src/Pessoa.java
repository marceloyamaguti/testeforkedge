public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i) {
            nome = n;
            idade = i;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        String n = nome;
        this.nome = n;
    }
}
