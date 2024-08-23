import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int scannerNumero;
        String scannerAgencia;
        String scannerNomeCliente;
        double scannerSaldo;
        
        ContaTerminal contaTerminal1 = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Nome do cliente :");
        scannerNomeCliente = scanner.nextLine();
        contaTerminal1.setNomeCliente(scannerNomeCliente);
        
        System.out.println("Digite o numero da Angência :");
        scannerAgencia = scanner.nextLine();
        contaTerminal1.setAgencia(scannerAgencia);

        System.out.println("Digite o numero da conta :");
        scannerNumero = scanner.nextInt();
        contaTerminal1.setNumero(scannerNumero);

        System.out.println("Digite o saldo :");
        scannerSaldo = scanner.nextDouble();
        contaTerminal1.setSaldo(scannerSaldo);

        contaTerminal1.exibirDadosCliente();

        scanner.close();

        
    }
}
