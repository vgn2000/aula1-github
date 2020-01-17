package Secao8;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ContaCorrente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor = 0;
		String y = null;
		String resposta;
		
		System.out.println("Enter account Number: ");
		int num_conta = sc.nextInt();
		
		System.out.println("Enter account Holder: ");
		String nameConta = sc.nextLine();
		Conta conta = new Conta(num_conta, nameConta);
		
		System.out.println(" Is there  the Initial deposit (Y/N): ");
		resposta = sc.nextLine();
		
		if (resposta == y)  {
			System.out.println(" Enter initial deposit value: ");
			double entradaInicial = 0;
		   entradaInicial = sc.nextDouble();
			conta.depositInitial(entradaInicial);
				
		} else {
			System.out.println("Account " + ",  " + conta );
		}
		
		
		System.out.println("Enter a deposit value: " );
		double value = sc.nextDouble();
		conta.deposit(value); 
		
		System.out.println("Enter a withdraw value: " );
		double valueWithdraw = sc.nextDouble();
		conta.deposit(valueWithdraw); 
		
		System.out.println("Updated date: " + conta);
		sc.close();

	}

}
