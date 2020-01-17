package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Funcionario;

public class ProgramaEmployees {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("How many Employees will be registered? ");
		int n = sc.nextInt();
	
		List<Funcionario> emp  = new ArrayList<>();
		
		for (int i =1 ; i<n; i++) {
			System.out.println("#" + i + " :");
			sc.nextLine();
			System.out.println("Enter the employee id : ");
			int id = sc.nextInt();
			System.out.println("Enter the name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the salary : ");
			
			double salary = sc.nextDouble();
			emp.add(new Funcionario(id, name, salary));
			
			
				
			}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Funcionario func = emp.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		
			if (func == null) {
		
				System.out.println("This is does not exist ");
				
				
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.resultSalarioPerc(percentage);
			}
			
			//Parte 3
			System.out.println();
			System.out.println("List of emploees: ");
			for (Funcionario obj : emp) {
				System.out.println(obj);
		
		}
			sc.close();
	
			
	}
		


}
