import java.util.Scanner;
import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n ==== LISTA DE COMPRAS ====");
            System.out.println("1 - Adicionar item: ");
            System.out.println("2 - Ver lista");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {

                case 1:
                    System.out.print("Digite o item: ");
                    String item = scanner.nextLine();

                    lista.add(item);

                    System.out.println("Item adicionado!");
                    break;


                case 2:

                    System.out.println("\n Sua lista: ");
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia.");
                    } else {

                        for (int i = 0; i < lista.size(); i++){
                            System.out.println((i+1) + " - " + lista.get(i));

                        }
                    }
                        break;


                case 3:

                    System.out.print("Número do item para remover: ");
                    int indice = scanner.nextInt();

                    if (indice > 0 && indice <= lista.size()){

                        lista.remove(indice-1);

                        System.out.println("Item removido!");
                    }


                    else {
                    System.out.println("Item inválido.");
                }

            break;

            case 4:

                System.out.println("Encerrando...");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    } while (opcao != 4);
    scanner.close();

    }
}