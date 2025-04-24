import java.util.Scanner;
import java.util.Random; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

       int numeroConta;
       String agencia;
       String nomeCliente;
       double saldo;
       

       Random r = new Random();

       
       System.out.println("Digite a agência: ");
       agencia = scan.nextLine();
      
       System.out.println("Digite o numero da conta: ");
       numeroConta = scan.nextInt();
       
       System.out.print("");
       nomeCliente = scan.nextLine();
       
       System.out.println("Digite seu nome: ");
       nomeCliente = scan.nextLine();

       saldo = r.nextDouble() * 150;
    

       System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta no nosso banco, sua agência é: "+agencia+", conta: "+numeroConta+" e seu saldo R$: "+saldo+" já está disponível para saque.");
       
       scan.close();
    }
}
