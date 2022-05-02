
public final class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(int numero, String nomeDoTitular) {
		super(numero, nomeDoTitular);
	}

	public ContaEspecial(int numero, String nomeDoTitular, double limite) {
		super(numero, nomeDoTitular);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public int calcularPontuacao() {
		// calcula baseado no limite
		return 77;
	}

}
