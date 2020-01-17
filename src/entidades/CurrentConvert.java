package entidades;

public class CurrentConvert {
	

	public double valorEmReais; 
	public double price;
	
	
	
	
	public double calcularConversaoMoeda(double price2, double qtdDollar2) {
		double calculoConversao = this.price * valorEmReais;
		double totalConversao = calculoConversao * 0.06;
		double totalGeral = totalConversao + calculoConversao;
		
		return totalGeral;
		 
	}

}
