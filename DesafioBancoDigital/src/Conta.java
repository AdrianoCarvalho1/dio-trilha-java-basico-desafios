
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	private static final double TAXA_JUROS_ANUAL = 0.06;
	private static final double TAXA_SELIC_ANUAL = 0.13;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;	
		}
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor > 0 && valor <= saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	protected void imprimirRendimentos(String conta) {
		if (conta == "Poupança") {
			double saldoOriginal = saldo;
			for (int anos = 1; anos <= 5; anos++) {
				double rendimento = saldoOriginal * Math.pow(1 + TAXA_JUROS_ANUAL, anos);
				depositar(rendimento);
				System.out.println(String.format("Rendimento em %d ano(s): %.2f", anos, rendimento));
			}
		}

		if (conta == "Corrente") {
			double saldoOriginal = saldo;
			for (int anos = 1; anos <= 5; anos++) {
				double rendimento = saldoOriginal * Math.pow(1 + TAXA_SELIC_ANUAL, anos);
				// Exibir o rendimento adicional
				System.out.println(String.format("Rendimento em %d ano(s) com SELIC: %.2f", anos, rendimento));
			}
		}
	}
}
