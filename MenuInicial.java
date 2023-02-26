import java.util.Scanner;
public class MenuInicial {

    Hash hash = new Hash(11);

    public void menuInicial(){

        System.out.println("-----------------------------------");
        System.out.println("Bem vindo à sua agenda!!");
        System.out.println("Digite:");
        System.out.println("1 - Inserir novo contato");
        System.out.println("2 - Pesquisar contato (pelo nome)");
        System.out.println("3 - Excluir contato");
        System.out.println("4 - Exibir lista de contatos");
        System.out.println("5 - Fechar agenda");
        System.out.println("-----------------------------------");

        Scanner input = new Scanner(System.in);
        int opcaoInicial = input.nextInt();

        switch (opcaoInicial){
            case 1:
                System.out.println("Digite o nome");
                String nome = input.next();
                System.out.println("Digite o telefone");
                String telefone = input.next();
                System.out.println("Digite o e-mail");
                String email = input.next();
                System.out.println("Digite a data de nascimento");
                String dataNascimento = input.next();
                System.out.println("Digite o celular");
                String celular = input.next();
                int codigo = nome.hashCode();

                hash.inserir(new Contato(codigo, nome, telefone, email, dataNascimento, celular));

                menuInicial();

            case 2:
                System.out.println("Digite o nome a ser buscado");
                String nomeBusca = input.next();
                System.out.println(hash.buscar(nomeBusca));

                menuInicial();
            case 3:
                System.out.println("Digite o nome a ser excluído");
                String nomeExclusao = input.next();
                hash.removerContato(nomeExclusao);
                menuInicial();

            case 4:
                System.out.println(hash);
                menuInicial();

            case 5:
                System.out.println("Obrigado e até breve!!");
                break;

            default:
                System.out.println("Opção inválida");
                menuInicial();
        }

        input.close();
    }

}
