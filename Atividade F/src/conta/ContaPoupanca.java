package conta;
public class ContaPoupanca extends Conta {

    /**
     *
     * @return
     */
    @Override
    public double getSaldo()
    {
        return this.saldo;
    }
    
    @Override
    void deposita(double quantidade)
    {
        this.saldo += quantidade;
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
        this.saldo += this.saldo * taxa*3;
    }
}        