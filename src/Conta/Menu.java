package Conta;

import java.util.Scanner;
import ProjetoContaBancaria.util.Cores;
import ProjetoContaBancaria.model.Conta;
import ProjetoContaBancaria.model.ContaCorrente; 
import ProjetoContaBancaria.model.ContaPoupanca;


public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int opc; 
		
		// teste de classe conta
		
		Conta c1 = new Conta  (1, 245, 1, "Jake Peralta", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		//teste conta corrente
		
		ContaCorrente  cc1 = new ContaCorrente (2,245,1,"Rosa Diaz", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//teste conta poupança
		
		ContaPoupanca cp1 = new ContaPoupanca (2, 245, 1,"Raymond Rolt", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		
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
		    
		    opc = read.nextInt();
		    
		    if (opc ==9) {
		    	System.out.println(Cores.TEXT_GREEN_BRIGHT + "\n thaibank - aqui seu dinheiro vale!! ");
		    	read.close();
		    	System.exit(0);
		    }
		    
		    switch (opc) {
		    case 1: System.out.println(Cores.TEXT_CYAN +"\n Criar a conta \n\n");
		    break;
		    case 2: System.out.println(Cores.TEXT_CYAN +"\n Listar todas as contas \n\n");
		    break;
		    case 3: System.out.println(Cores.TEXT_CYAN +"\n Consultar dados da conta - por número \n\n");
		    break;
		    case 4: System.out.println(Cores.TEXT_CYAN +"\n Atualizar dados da Conta \n\n");
		    break;
		    case 5: System.out.println(Cores.TEXT_CYAN +"\n Apagar Conta\n\n");
		    break;
		    case 6: System.out.println(Cores.TEXT_CYAN +"\nSaque\n\n");
		    break;
		    case 7: System.out.println(Cores.TEXT_CYAN +"\nDepósito\n\n");
		    break;
		    case 8: System.out.println(Cores.TEXT_CYAN +"\n Transferência entre Contas\n\n");
		    break;
		    default: System.out.println(Cores.TEXT_RED +"\n Opção inválida\n\n");
		    break;
		    
		    }


		}
	}

}
