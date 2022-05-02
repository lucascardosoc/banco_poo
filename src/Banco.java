
public class Banco {

	public static void main(String[] args) {

		ContaPoupanca contaPoupanca1 = new ContaPoupanca(54321, "Pedro");
		ContaCorrente contaCorrente = new ContaCorrente(12345, "Lucas");
		ContaEspecial contaEspecial = new ContaEspecial(65438, "Marta");
		
		System.out.println(Conta.getCotacaoDoDolar());
		
		contaCorrente.depositar(1000);
		contaCorrente.depositar(500);
		contaCorrente.sacar(300);
		contaCorrente.transferir(200, contaPoupanca1);
		contaCorrente.transferir(600, contaEspecial);

		System.out.println("Conta corrente: R$ " + contaCorrente.getSaldo());
		System.out.println("Conta Poupanca: R$ " + contaPoupanca1.getSaldo());
		System.out.println("Conta Especial: R$ " + contaEspecial.getSaldo());

		contaPoupanca1.depositar(10);

		ContaPoupanca contaPoupanca2 = new ContaPoupanca(54321, "Pedro, 0.02");
		contaPoupanca2.depositar(2);

	}

}
