package Conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int opc; 
		
		while (true) {
			
			System.out.println("------------------------------------------");
			System.out.println("                                          ");
			System.out.println("                thaibank                  ");
			System.out.println("                                          ");
			System.out.println("------------------------------------------");
			System.out.println("                                          ");
			System.out.println("        1- Criar Conta                    ");
			System.out.println("        2- Listar Todas as Contas         ");
			System.out.println("        3- Buscar Conta por número        ");
			System.out.println("        4- Atualizar Dados da conta       ");
			System.out.println("        5- Apagar Conta                   ");
			System.out.println("        6- Sacar                          ");
			System.out.println("        7- Depositar                      ");
			System.out.println("        8- Transferir valores entre contas");
			System.out.println("        9- Sair                           ");
		    System.out.println("                                          ");
		    System.out.println("------------------------------------------");
		    System.out.println("          Entre com a opção desejada:              ");
		    System.out.println("                                          ");
		    
		    opc = read.nextInt();
		    
		    if (opc ==9) {
		    	System.out.println("\n thaibank - aqui seu dinheiro vale!! ");
		    	read.close();
		    	System.exit(0);
		    }
		    
		    switch (opc) {
		    case 1: System.out.println("\n Criar a conta \n\n");
		    break;
		    case 2: System.out.println("\n Listar todas as contas \n\n");
		    break;
		    case 3: System.out.println("\n Consultar dados da conta - por número \n\n");
		    break;
		    case 4: System.out.println("\n Atualizar dados da Conta \n\n");
		    break;
		    case 5: System.out.println("\n Apagar Conta\n\n");
		    break;
		    case 6: System.out.println("\nSaque\n\n");
		    break;
		    case 7: System.out.println("\nDepósito\n\n");
		    break;
		    case 8: System.out.println("\n Transferência entre Contas\n\n");
		    break;
		    default: System.out.println("\n Opção inválida\n\n");
		    break;
		    
		    }


		}
	}

}
