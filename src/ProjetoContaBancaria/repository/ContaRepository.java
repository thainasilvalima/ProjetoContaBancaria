package ProjetoContaBancaria.repository;

import ProjetoContaBancaria.model.Conta;

public interface ContaRepository {
	//crud da conta
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	//métodos bancários
	public void sacar (int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir (int numeroOrigem, int numeroDestino, float valor);
	

}
