public class EnfermeiroTrabalho extends Funcionario {
    String cofen;

    public String getCofen() {
        return cofen;
    }

    public void setCofen(String cofen) {
        this.cofen = cofen;
    }

    public EnfermeiroTrabalho(String nome, String cpf, String dtNascimento, String cofen) {
        super(nome, cpf, dtNascimento);
        this.cofen = cofen;
    }

    
}
