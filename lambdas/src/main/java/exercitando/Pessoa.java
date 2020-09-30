package exercitando;

public class Pessoa {
    private String primeiroNome;
    private String UltimoNome;
    private int idade;

    public Pessoa(String primeiroNome, String ultimoNome, int idade) {
        this.primeiroNome = primeiroNome;
        UltimoNome = ultimoNome;
        this.idade = idade;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return UltimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        UltimoNome = ultimoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", UltimoNome='" + UltimoNome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
