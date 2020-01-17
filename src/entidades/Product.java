package entidades;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public double soma;
	public double totalGeral;
	public double totalAtualizado;
	
	public Product() {
		
	}
	
	
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



	public Product(String name, double price) {
		this.name   = name;
		this.price  = price;
		
		//Opcional
		//this.quantity = 0 - toda variavel to type int e iniciada com zero
		//como foi tirada a variava do tipo quantity, nao preciso usar o this
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;

	}

	public void AddProduts(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	public String toString() {
		return name + " , $" + String.format("%.2f", price) + " , " + quantity + " units, Total: $ "
				+ totalValueInStock();
	}

}
