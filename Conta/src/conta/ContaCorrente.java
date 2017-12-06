package conta;
public class ContaCorrente extends Conta {
    public double getsaldo()
    {
        return this.saldo;
    }        
    
    @Override
    void deposita(double quantidade)
    {
        this.saldo += quantidade-0.;
    }        
    
    @Override
    void saca(double quantidade)
    {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    
    @Override
    void transfere(Conta destino, double valor)
    {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    
    @Override
    void atualiza(double taxa)
    {
        this.saldo += this.saldo * taxa*2;
    }        
            
}
