
public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String nomeDoTitular) {
		super(numero, nomeDoTitular);
	}

	public int calcularPontuacao() {
		// calcula baseado na movimentac�o
		return 10;
	}

}
