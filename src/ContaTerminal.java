import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        String saldo = scanner.nextLine();


        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
