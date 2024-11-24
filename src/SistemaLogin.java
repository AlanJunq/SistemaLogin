import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                tentativas++;
                System.out.println("Login ou senha incorretos. Tentativa " + tentativas + " de 3.");
            }
        }

        if (tentativas == 3) {
            System.out.println("Número de tentativas excedido. Acesso bloqueado.");
        }

        scanner.close();
    }
}

