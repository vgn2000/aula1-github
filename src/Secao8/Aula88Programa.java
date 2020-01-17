package Secao8;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aula88VetorProduct;

public class Aula88Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Aula88VetorProduct[] vect = new Aula88VetorProduct[n];   //Vetor sendo Class (referencia)
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Aula88VetorProduct(name, price );
			
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum = sum + vect[i].getPrice();
			
		}
		
		double avg = sum /vect.length;
		System.out.printf("Average : %.2f%n" , avg);
		sc.close();

	}

}
