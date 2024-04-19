import java.util.ArrayList;

public class Gerenciador {
    public static final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void addFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public static void excluirTodos() {
        listaFuncionarios.clear();
        System.out.println("Todos os funcionários foram removidos.");
    }

    
    public static void buscarFuncionario(){
        System.out.println("Qual o nome do funcionário que você deseja buscar?");
        String nomeBuscado = Console.lerString();

        boolean encontrado = false;

        for(Funcionario funcionario:listaFuncionarios){
            if (funcionario.getNome().equals(nomeBuscado)){
                System.out.println("O nome "+nomeBuscado+" foi encontrado!");
                encontrado = true;
                break;
            }
        } 
        if(!encontrado){
            System.out.println("O nome "+nomeBuscado+" não foi encontrado");
        }
 } 

    public static void listarTodosNomes(){
        if (listaFuncionarios.size() == 0) {
            System.out.println("Não há nenhum funcionário na lista");
        }

        for (Funcionario funcionario : listaFuncionarios){
            System.out.println(funcionario.getNome());
            }
        }
    

    public static void excluirFuncionario(){
        System.out.println("Quem você deseja remover?");
        listarTodosNomes();
        System.out.print("Escreva o nome completo de quem deseja remover: ");
        String nomeFuncionario = Console.lerString();

        boolean encontrado = false;

        for(Funcionario funcionario : listaFuncionarios){
          
            if (funcionario.getNome().equals(nomeFuncionario)) {
                listaFuncionarios.remove(funcionario);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Nome não encontrado");
        }
    }

    public static void editarFuncionario(){
        if (listaFuncionarios.size() == 0) {
            System.out.println("Não possui nenhum funcionário na lista");
            return;
        }
        System.out.println("Quem você deseja editar?");
        listarTodosNomes();
        System.out.print("Opção: ");
        String opFuncionario = Console.lerString();

        for(Funcionario funcionario : listaFuncionarios){
            if(funcionario.getNome().equals(opFuncionario)){
                System.out.println("O que você deseja alterar?");
                System.out.println("1) Nome");
                System.out.println("2) CPF");
                System.out.println("3) Data de nascimento");
                System.out.println("0) Cancelar alteração");
                int op = Console.lerInt();

                switch (op) {
                    case 1:
                    System.out.println("O nome atual é: "+opFuncionario+" você deseja alterar para...");
                    funcionario.setNome(Console.lerString());
                    System.out.println("O nome foi alterado para "+funcionario.getNome());    
                        break;
                    
                    case 2:
                    System.out.println("O CPF atual é: "+funcionario.getCpf()+" você deseja alterar para...");
                    funcionario.setCpf(Console.lerString());
                    System.out.println("O CPF foi alterado para "+funcionario.getCpf());    
                        break;

                    case 3:
                    System.out.println("A data de nascimento atual é: "+funcionario.getDtNascimento()+" você deseja alterar para...");
                    funcionario.setDtNascimento(Console.lerString());
                    System.out.println("A data de nascimento foi alterada para "+funcionario.getDtNascimento());    
                        break;
                    
                    case 0:
                    return;
                
                    default:
                    System.out.println("Erro, nenhuma opção válida");
                        break;
                }
            }

        }


    }
}