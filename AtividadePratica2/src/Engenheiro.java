public class Engenheiro extends Funcionario{
    String crea;

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public Engenheiro(String nome, String cpf, String dtNascimento, String crea) {
        super(nome, cpf, dtNascimento);
        this.crea = crea;
    }

}
