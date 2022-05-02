
public abstract class Conta {

	protected static final String NOME_DO_BANCO = "FIAP BANK";
	public static int totalDeContas = 0;
	private int numero;
	private String nomeDoTitular;
	private double saldo;

	public Conta(int numero, String nomeDoTitular) {
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
	} // imutabilidade

	public abstract int calcularPontuacao();

	public final void depositar(double valor) {
		if (valor > 0)
			saldo += valor;
	}

	public void sacar(double valor) {
		if (valor > 0)
			saldo -= valor;
	}

	public void transferir(double valor, Conta contaDeDestino) { // polimorfismo
		this.sacar(valor);
		contaDeDestino.depositar(valor);
	}

	public int getNumero() {
		return numero;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public static double getCotacaoDoDolar() {
		return 5;
	}

}
