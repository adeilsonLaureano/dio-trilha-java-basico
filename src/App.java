import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome !");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();
        
        ContaTerminal contaTerminal = new ContaTerminal(conta, agencia, nomeCliente, saldo);

    }
}
