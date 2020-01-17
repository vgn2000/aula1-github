package entidades;

public class Funcionario {
	
	private int id;
	private String name;
	private double salario;
	
	
	public Funcionario(int id, String name, double salario) {
		
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
public Funcionario(int id, double salario) {
		
		this.id = id;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void resultSalarioPerc(double percentual) {

		salario += salario * percentual /100.00;
		
	}
	

	public String toString() {
		return id + " ," +  name + " , $" + String.format("%.2f", salario); 
				
	}


	public int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}