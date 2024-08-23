public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumero(int numero){
        return this.numero;
    }

    public String getAgencia(int agencia){
        return this.agencia;
    }
    
    public String getNomeCliente(int nomeCliente){
        return this.nomeCliente;
    }
    
    public double getSaldo(int saldo){
        return this.saldo;
    }

    public void exibirDadosCliente(){
        System.out.println("Olá " +  this.nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua Agência é " + this.agencia + 
        ", Conta " + this.numero + 
        " e seu saldo " + this.saldo + 
        " já está disponível para saque.");
    }
    
}
