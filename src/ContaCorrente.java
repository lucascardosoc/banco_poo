
public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String nomeDoTitular) {
		super(numero, nomeDoTitular);
	}

	public int calcularPontuacao() {
		// calcula baseado na movimentacão
		return 10;
	}

}
