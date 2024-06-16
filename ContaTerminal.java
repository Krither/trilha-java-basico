import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitação de dados ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt(); // Assume que o usuário irá inserir um inteiro válido
        scanner.nextLine(); // Consome a quebra de linha
        
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        saldo = scanner.nextDouble();
        
        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
