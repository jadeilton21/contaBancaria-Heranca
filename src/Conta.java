public class Conta {




    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    private static int total = 0;




    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("--> Depositando "+ valor + " Seu saldo é de: " + this.saldo);


    }

    public boolean sacar(int valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }

    }


    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }


    public Conta(int numero, int agencia) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
