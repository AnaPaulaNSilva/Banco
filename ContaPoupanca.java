
public class ContaPoupanca extends conta {
	
	private double taxa;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) throws ContaPoupancaException {
        throw new ContaPoupancaException("Não é possível realizar saque em uma conta poupança."); 
    }

    public double getTaxa() {
        return taxa;
    }



}