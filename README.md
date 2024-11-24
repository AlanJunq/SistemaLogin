# Sistema de Login

Este programa simula um sistema de login que permite ao usuário tentar acessar uma conta com login e senha. O usuário tem até 3 tentativas para inserir as credenciais corretas. Após 3 tentativas erradas, o acesso é bloqueado.

## Como Usar

1. O programa solicita ao usuário:
   - **Login**: Digite o nome de usuário.
   - **Senha**: Digite a senha.

2. O sistema verifica se as credenciais estão corretas (login: `java8` e senha: `java8`).

3. O programa permite até **3 tentativas**. Se o login e a senha estiverem corretos, o acesso é concedido. Se estiverem incorretos, o número de tentativas restantes é mostrado.

4. Se o usuário falhar 3 vezes, o acesso é bloqueado.

## Como Executar

### Passos

1. **Crie um arquivo Java** com o código abaixo:

   ```java
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

2. **Compile o código:**

javac SistemaLogin.java

3. **Execute o programa:**

java SistemaLogin