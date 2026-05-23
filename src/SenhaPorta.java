import java.util.Scanner;

public class SenhaPorta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String senhaPadrao = "1234";
        String senhaMestra = "admin";
        int tentativas = 3;

        do {
            System.out.println("Digite a senha: ");
            String senhaDigitada = scanner.nextLine().trim();

            if (senhaDigitada.equals(senhaPadrao) || senhaDigitada.equalsIgnoreCase(senhaMestra)){
                System.out.println("Acesso autorizado!");
                break;

            } else {
                tentativas--;

                if (tentativas > 0 ){
                    System.out.println("Acesso negado, ainda restam "+tentativas+" tentativas");
                } else {
                    System.out.println("Sistema bloqueado.");
                }
            }

        } while (tentativas > 0);

            scanner.close();
    }


    }







