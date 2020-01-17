package Secao8;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("price: ");
		double price = sc.nextDouble();
		System.out.print("quantity: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price);
		produto.setName("Computer" );
		System.out.println("Updated name: " + produto.getName());
		
		produto.setPrice(1200.00);
		System.out.println("Updated price: " + produto.getPrice());
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.print(" Enter the number of products to be added in Stock: ");
		
		quantity = sc.nextInt();
		produto.AddProduts(quantity);
		
		System.out.println();
		System.out.println("Updated date: " + produto);
		
		System.out.println();
		System.out.print(" Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		produto.RemoveProducts(quantity);
		System.out.println();
		System.out.println("Updated date: " + produto);
	//	System.out.println(produto.name + "," + produto.price + "," + produto.quantity);
		sc.close();
	}

}
