package Conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ProjetoContaBancaria.util.Cores;
import ProjetoContaBancaria.controller.ContaController;
import ProjetoContaBancaria.model.Conta;
import ProjetoContaBancaria.model.ContaCorrente; 
import ProjetoContaBancaria.model.ContaPoupanca;


public class Menu {

	public static void main(String[] args) { 
		
		ContaController contas = new ContaController();
		
		Scanner read = new Scanner(System.in);
		
		int opc, numero, agencia,tipo,aniversario, numeroDestino;
		
		String titular;
		
		float saldo,limite, valor;
		
		System.out.println("\n Criar Contas ");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123,1,"Jake Peralta",1000f,100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124,1,"Rosa Diaz",2000f,100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125,2,"Raymond Holt",4000f,12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125,2,"Gina Linetti",8000f,15);
		contas.cadastrar(cp2);
		
		
		contas.listarTodas();
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
					+"------------------------------------------ ");
			System.out.println("                                           ");
			System.out.println("                thaibank                   ");
			System.out.println("                                           ");
			System.out.println("------------------------------------------ ");
			System.out.println("                                           ");
			System.out.println("        1- Criar Conta                     ");
			System.out.println("        2- Listar Todas as Contas          ");
			System.out.println("        3- Buscar Conta por número         ");
			System.out.println("        4- Atualizar Dados da conta        ");
			System.out.println("        5- Apagar Conta                    ");
			System.out.println("        6- Sacar                           ");
			System.out.println("        7- Depositar                       ");
			System.out.println("        8- Transferir valores entre contas ");
			System.out.println("        9- Sair                            ");
		    System.out.println("                                           ");
		    System.out.println("------------------------------------------ ");
		    System.out.println("          Entre com a opção desejada:      ");
		    System.out.println("                                           " 
		    + Cores.TEXT_RESET);
		    
		    try {
				opc = read.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				opc=0;
			}

		    
		    if (opc ==9) {
		    	System.out.println(Cores.TEXT_GREEN_BRIGHT + "\n thaibank - aqui seu dinheiro vale!! ");
		    	read.close();
		    	System.exit(0);
		    }
		    
		    switch (opc) {
		    
		    case 1: System.out.println(Cores.TEXT_CYAN +"\n Criar a conta \n\n");
		    
		    System.out.println("\nDigite o número da Agência: ");
		    agencia = read.nextInt();
		    System.out.println("\n Digite o nome do Titular: ");
		    read.skip("\\R?");
		    titular = read.nextLine();
		    
		    do {
		    System.out.println("\n Digite o tipo de Conta (1- Conta Corrente ou 2- Conta Poupança): ");
		    tipo = read.nextInt();
		    }
		    while (tipo < 1 && tipo > 2);
		    
		    System.out.println("\n Digite o saldo da Conta R$: ");
		    saldo = read.nextFloat();
		    
		    switch(tipo) {
		    case 1 -> {
		    System.out.println("\n Digite o Limite de crédito R$: ");
		    limite = read.nextFloat();
		    contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
		    }
		    case 2 -> {
		    System.out.println("\n Digite o dia do aniversário da conta: ");
		    aniversario = read.nextInt();
		    contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		    }
		    
		    }
		    keyPress();
		    break;
		    
		    case 2: System.out.println(Cores.TEXT_CYAN +"\n Listar todas as contas \n\n");
		    contas.listarTodas();
		    
		    keyPress();
		    break;
		    
		    case 3: System.out.println(Cores.TEXT_CYAN +"\n Consultar dados da conta - por número \n\n");
		    
		    System.out.println("\nDigite o número da conta: ");
		    numero = read.nextInt();
		    contas.procurarPorNumero(numero);
		    
		    keyPress();
		    break;
		    
		    case 4: System.out.println(Cores.TEXT_CYAN +"\n Atualizar dados da Conta \n\n");
		    
		    System.out.println("\nDigite o número da conta: ");
		    numero = read.nextInt();
		    
		    if (contas.buscarNaCollection(numero) !=null) {
		    
		    System.out.println("\nDigite o número da Agência: ");
		    agencia = read.nextInt();
		    System.out.println("\n Digite o nome do Titular: ");
		    read.skip("\\R?");
		    titular = read.nextLine();
		    
		    System.out.println("\n Digite o saldo da Conta R$: ");
		    saldo = read.nextFloat();
		    
		    tipo = contas.retornaTipo(numero);
		    
		    switch (tipo) {
		    case 1 -> {
			    System.out.println("\n Digite o Limite de crédito R$: ");
			    limite = read.nextFloat();
			    contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
			    }
			    case 2 -> {
			    System.out.println("\n Digite o dia do aniversário da conta: ");
			    aniversario = read.nextInt();
			    contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
			    }
			    default -> {
			    	System.out.println("\nTipo de conta inválido!");
		    } 
		    
		    }
		   
		    } else System.out.println("\nConta não encontrada!");
		    
		    keyPress();
		    break;
		    
		    case 5: System.out.println(Cores.TEXT_CYAN +"\n Apagar Conta\n\n");
		    
		    System.out.println("\nDigite o número da conta: ");
		    numero = read.nextInt();
		    
		    contas.deletar(numero);
		    
		    keyPress();
		    break;
		    
		    case 6: System.out.println(Cores.TEXT_CYAN +"\nSaque\n\n");
		    
		    System.out.println("\nDigite o número da conta: ");
		    numero = read.nextInt();
		    
		     do { System.out.println("\n Digite o Valor do Saque R$: ");
		     valor= read.nextFloat();
		    	 
		     } while  (valor <=0);
		     
		     contas.sacar(numero, valor);
		     
		    keyPress();
		    break;
		    
		    case 7: System.out.println(Cores.TEXT_CYAN +"\nDepósito\n\n");
		    
		    System.out.println("\nDigite o número da conta: ");
		    numero = read.nextInt();
		    
		    do {
		    	System.out.println("\nDigite o valor do depósito R$: ");
		    	valor = read.nextFloat();
		    } while (valor <=0);
		    
		    contas.depositar(numero, valor);
		    
		    keyPress();
		    break;
		    
		    case 8: System.out.println(Cores.TEXT_CYAN +"\n Transferência entre Contas\n\n");
		    
		    System.out.println("\nDigite o número da conta de Origem: ");
		    numero = read.nextInt();
		    
		    System.out.println("\nDigite o número da conta de Destino: ");
		    numeroDestino = read.nextInt();
		    
		    do { 
		    	System.out.println("\n Digite o valor da Transferência R$: ");
		    	valor = read.nextFloat();
		    
		    } while (valor <=0);
		    
		    contas.transferir(numero, numeroDestino, valor);
		    
		    keyPress();
		    break;
		    
		    default: System.out.println(Cores.TEXT_RED +"\n Opção inválida\n\n");
		    keyPress();
		    break;
		    
		    }
		}
	}
	       public static void keyPress() {
	    	   try {System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
	    	   System.in.read();
	    	   }
	    	   catch (IOException e) { System.out.println("Você pressionou uma tecla diferente de enter!");}
	       }

}
