import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bem vindo, insira o numero da sua conta: ");
        Integer numero_conta = scanner.nextInt();

        System.out.print("Insira o nome do titular da conta: ");
        String nome_cliente = scanner.next();

        System.out.print("Insira o saldo inicial: ");
        Double saldo_inicial = scanner.nextDouble();

        System.out.print("Insira o numero de sua agencia: ");
        Integer agencia = scanner.nextInt();

        System.out.println(
                "Ola " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia
                        + ", conta " + numero_conta + " e seu saldo " + saldo_inicial + " esta disponivel para saque.");

        scanner.close();
    }
}
