import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, insira o número da conta!");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, insira o número da agência!");
        agencia = scan.nextLine();

        System.out.println("Por favor, insira o nome do cliente!");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, insira o saldo do cliente!");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scan.close();
    }
}