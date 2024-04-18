public class TecnicoSeguranca extends Funcionario {
    String crt;

    public TecnicoSeguranca(String nome, String cpf, String dtNascimento, String crt) {
        super(nome, cpf, dtNascimento);
        this.crt = crt;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }
    
}
