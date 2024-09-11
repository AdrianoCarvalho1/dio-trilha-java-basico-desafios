
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void imprimirExtratosRendimentos() {
		System.out.println("=== Rendimentos Anuais Conta Corrente ===");
		super.imprimirRendimentos("Corrente");
	}
	
}
