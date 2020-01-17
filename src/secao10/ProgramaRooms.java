package secao10;

import java.util.Locale;
import java.util.Scanner;

import entidades.Rooms;

public class ProgramaRooms {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rooms[] vect = new Rooms [10];
		System.out.println("How many rooms will be rented? :");
		int n = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			
			System.out.println();
			System.out.println("Rent # " + i + " :");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Emails: ");
			String email = sc.nextLine();
			
			System.out.println("Rooms: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Rooms(name, email);
					
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] !=null) {
				System.out.println(i + ":" + vect[i]);
			}
			
		}
		sc.close();

	}

}
