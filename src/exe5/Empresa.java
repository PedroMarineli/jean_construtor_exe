package src.exe5;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private long CEP;
    private long fone;

    public Empresa(String nome, String cidade, String estado, String endereco, long CEP, long fone) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
        this.estado = estado;
        this.CEP = CEP;
        this.fone = fone;
    }

    public Empresa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

    public long getFone() {
        return fone;
    }

    public void setFone(long fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", CEP=" + CEP +
                ", fone=" + fone +
                '}';
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
