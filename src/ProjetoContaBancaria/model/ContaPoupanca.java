package ProjetoContaBancaria.model;

public class ContaPoupanca extends Conta {
	private int aniversario; 

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;		
	}
	
	public int getAniversario() {
		return aniversario;
		
	}
	
	public int setAniversario(int aniversario) {
		this.aniversario = aniversario;
		
	}
	public void visualizar() {
		
		super.visualizar();
		System.out.println("\nAniversário da Conta: " + this.aniversario);
	}

}
