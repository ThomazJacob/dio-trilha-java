import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
                
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo disponível: ");
        Double saldo = scanner.nextDouble(); 
        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
