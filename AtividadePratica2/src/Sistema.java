
public class Sistema {

    public static void executar() {
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = Console.lerInt();
            System.out.println();
            switch (opcao) {
                case 1:
                int op2;
                do{
                    System.out.println("Escolha quem você deseja cadastrar");
                    System.out.println("1) Técnico Segurança do Trabalho");
                    System.out.println("2) Enfermeiro do Trabalho");
                    System.out.println("3) Médico do Trabalho");
                    System.out.println("4) Engenheiro de Segurança do Trabalho");
                    System.out.println("0) Sair");
                    System.out.print("Opção: ");
                    op2 = Console.lerInt();
                        switch (op2) {
                            case 1:
                            System.out.println("\nPrimeiro, vamos inserir as informações do seu Técnico de Segurança do Trabalho");
                            TecnicoSeguranca f1 = new TecnicoSeguranca(null, null, null, null);
                            System.out.print("Nome do funcionário: ");
                            f1.setNome(Console.lerString());
                            System.out.print("CPF: ");
                            f1.setCpf(Console.lerString());
                            System.out.print("Data de nascimento: ");
                            f1.setDtNascimento(Console.lerString());
                            System.out.print("CRT: ");
                            f1.setCrt(Console.lerString());
                            
                            Gerenciador.addFuncionario(f1);
                            System.out.println("\nUsuário "+f1.getNome()+" adicionado ao SESMT como Técnico de Segurança do Trabalho\n");
                                break;
                            
                            case 2:
                            System.out.println("\nPrimeiro, vamos inserir as informações do seu Enfermeiro do Trabalho");
                            EnfermeiroTrabalho f2 = new EnfermeiroTrabalho(null, null, null, null);
                            System.out.print("Nome do funcionário: ");
                            f2.setNome(Console.lerString());
                            System.out.print("CPF: ");
                            f2.setCpf(Console.lerString());
                            System.out.print("Data de nascimento: ");
                            f2.setDtNascimento(Console.lerString());
                            System.out.print("COFEN: ");
                            f2.setCofen(Console.lerString());
                            
                            Gerenciador.addFuncionario(f2);
                            System.out.println("\nUsuário "+f2.getNome()+" adicionado ao SESMT como Enfermeiro do Trabalho\n");
                            break;
                            
                            case 3:
                            System.out.println("\nPrimeiro, vamos inserir as informações do seu Médico do Trabalho");
                            MedicoTrabalho f3 = new MedicoTrabalho(null, null, null, null);
                            System.out.print("Nome do funcionário: ");
                            f3.setNome(Console.lerString());
                            System.out.print("CPF: ");
                            f3.setCpf(Console.lerString());
                            System.out.print("Data de nascimento: ");
                            f3.setDtNascimento(Console.lerString());
                            System.out.print("CRM: ");
                            f3.setCrm(Console.lerString());
                            
                            Gerenciador.addFuncionario(f3);
                            System.out.println("\nUsuário "+f3.getNome()+" adicionado ao SESMT como Médico do Trabalho\n");
                            break;

                            case  4:
                            System.out.println("\nPrimeiro, vamos inserir as informações do seu Engenheiro de Segurança do Trabalho");
                            Engenheiro f4 = new Engenheiro(null, null, null, null);
                            System.out.print("Nome do funcionário: ");
                            f4.setNome(Console.lerString());
                            System.out.print("CPF: ");
                            f4.setCpf(Console.lerString());
                            System.out.print("Data de nascimento: ");
                            f4.setDtNascimento(Console.lerString());
                            System.out.print("CREA: ");
                            f4.setCrea(Console.lerString());
                            
                            Gerenciador.addFuncionario(f4);
                            System.out.println("\nUsuário "+f4.getNome()+" adicionado ao SESMT como Engenheiro de Segurança do Trabalho\n");
                            break;

                            default:
                            System.out.println("\nOpção inválida, tente novamente\n");
                                break;
                        }
                }while(op2!=0);
                    
                    break;
                case 2:
                    Gerenciador.buscarFuncionario();
                    break;
                case 3:
                    Gerenciador.editarFuncionario();
                    break;
                case 4:
                    Gerenciador.excluirFuncionario();
                    break;
                case 5:
                    Gerenciador.listarTodosNomes();
                    break;
                case 6:
                    Gerenciador.excluirTodos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        return;
    }

    private static void exibirMenu() {

        System.out.println("\nBem vindo ao cadastro de SESMT da empresa VEP");
        System.out.println("================= MENU =================");
        System.out.println("1) Cadastrar funcionário");
        System.out.println("2) Buscar funcionário");
        System.out.println("3) Editar funcionário");
        System.out.println("4) Excluir funcionário");
        System.out.println("5) Listar todos os funcionários");
        System.out.println("6) Excluir todos os funcionários");
        System.out.println("0) Sair");
        System.out.println("==================================");
}

    


}