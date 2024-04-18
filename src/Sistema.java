
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
                        
                            default:
                                break;
                        }
                }while(op2!=0);
                    
                    break;
                case 2:
                    // Método para buscar funcionário do SESMT
                    break;
                case 3:
                    // Método para editar funcionário do SESMT
                    break;
                case 4:
                    // Método para excluir funcionário do SESMT
                    break;
                case 5:
                    // Método para listar todos os funcionários do SESMT
                    break;
                case 6:
                    // Método para excluir todos os funcionários do SESMT
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