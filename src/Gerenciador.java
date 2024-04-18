import java.util.ArrayList;

public class Gerenciador {
    private static final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void addFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static void removerFuncionario(String cpf){
        listaFuncionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpf));
    }  

    public static void listarFuncionarios() {
        listaFuncionarios.clear();
    }
}
