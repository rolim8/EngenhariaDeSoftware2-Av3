package Q3;
import java.util.Calendar;

public class Pessoa{
    private String nome;
    private Calendar dataDeNascimento;
    private String numeroDoCpf;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNumeroDoCpf() {
        return numeroDoCpf;
    }

    public void setNumeroDoCpf(String numeroDoCpf) {
        this.numeroDoCpf = numeroDoCpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
