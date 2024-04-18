public class MedicoTrabalho extends Funcionario {
    String crm;

    public MedicoTrabalho(String nome, String cpf, String dtNascimento, String crm) {
        super(nome, cpf, dtNascimento);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
}
