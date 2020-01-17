package Secao8;

import java.util.Locale;
import java.util.Scanner;

import entidades.Account;

public class CorrecaoContaCorrenteProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account Holder: ");
		sc.nextLine(); //Tenho que fazer isso para que seja consumida a Quebra de linha do Next.Int() que ficou pendente acima
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? : ");
		char response = sc.next().charAt(0);
		
		if (response == 'y')  {
			System.out.println(" Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, holder, initialDeposit);
	}  else {
		account = new Account(number, holder);
	}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();
}
}