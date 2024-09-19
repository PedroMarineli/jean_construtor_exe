package src.exe4;

public class CadernoDeEnderecos {
    private String nome;
    private long telefone;
    private String email;
    private int diaNiver;
    private int mesNiver;
    private int anoNiver;

    public CadernoDeEnderecos(int anoNiver, int mesNiver, int diaNiver, String email, long telefone, String nome) {
        this.anoNiver = anoNiver;
        this.mesNiver = mesNiver;
        this.diaNiver = diaNiver;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiaNiver() {
        return diaNiver;
    }

    public void setDiaNiver(int diaNiver) {
        this.diaNiver = diaNiver;
    }

    public int getMesNiver() {
        return mesNiver;
    }

    public void setMesNiver(int mesNiver) {
        this.mesNiver = mesNiver;
    }

    public int getAnoNiver() {
        return anoNiver;
    }

    public void setAnoNiver(int anoNiver) {
        this.anoNiver = anoNiver;
    }
}
