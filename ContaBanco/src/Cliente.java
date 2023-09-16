import java.util.Locale;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens pelo nosso usuário

            System.out.println("Por favor, digite sua conta ");
            int conta = scanner.nextInt();

            System.out.println("Digite sua agência");
            String agencia = scanner.next();

            System.out.println("Digite seu nome ");
            String nomeCliente = scanner.next();

            System.out.println("Qual valor você depositou em sua conta ? ");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco !");
            System.out.println("Sua agência: " + agencia + " --- Sua conta: " + conta);
            System.out.println("Seu saldo é de: $ " + saldo + " já está disponível para saque ");
    }
}
