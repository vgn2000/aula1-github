package Secao8;
import java.util.Locale;
import java.util.Scanner;

import entidades.CurrentConvert;

public class ProgramaConversaoSecao8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price: ? ");
		CurrentConvert conv = new CurrentConvert();
		
		conv.price = sc.nextDouble();
		System.out.println();
		System.out.print("How Many dollar will be bought: ? ");
		conv.valorEmReais = sc.nextDouble();
		
		double valorFinal = conv.calcularConversaoMoeda(conv.price, conv.valorEmReais );
		
		System.out.println("Amount to be paid in Reais : " + valorFinal );
	
	    sc.close();

	}

}
