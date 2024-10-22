
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Marcus");
		Cliente cliente2 = new Cliente("Vinicius");
		Cliente cliente3 = new Cliente("Breno");

		ArrayList<Cliente> contas = new ArrayList();

		Banco banco = new Banco("Banco do Brasil");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);
		Conta cc2 = new ContaCorrente(cliente3);

		contas.add(cc,poupanca, cc2)

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc2.depositar(1500)
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2..imprimirExtrato();
	}

}
