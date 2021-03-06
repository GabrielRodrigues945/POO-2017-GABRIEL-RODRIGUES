package conta;
//7.7 Fj-11
public class Conta {

    /**
     *
     */
    protected int numero;
    protected String dono;
    protected double saldo;
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    void deposita(double quantidade)
    {
        this.saldo += quantidade;
    }
    
    void saca(double quantidade)
    {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;        
    }
    
    void transfere(Conta destino, double valor)
    {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    
    void atualiza(double taxa)
    {
        this.saldo += this.saldo * taxa;
    }        
}



