import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.print("Por favor, Digite seu Nome: ");
            String nome = scanner.next();

            System.out.print("Agora, Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.print("Digite o numero da sua Conta: ");
            int numeroConta = scanner.nextInt();

            System.out.print("Digite saldo para Deposito R$ ");
            Double saldo = scanner.nextDouble();

            String saldoFormatado = String.format("%.2f", saldo);

            System.out.println("Olá, " + nome + " " + sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo R$ " + saldoFormatado + " já está disponível para saque");

        } finally{
            scanner.close();
        }
    }
}
