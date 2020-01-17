package entidades;

public class Conta {

	private int numConta;
	private String titularConta;
	private double deposito;
	private double saldo = 0;
	
	
	
	public Conta(int numConta, String titularConta) {
		
		this.numConta = numConta;
		this.titularConta = titularConta;
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getTitularConta() {
		return titularConta;
	}


	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}


	public double getDeposito() {
		return deposito;
	}


	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double withdraw (double valor) {
		
			
		this.saldo = ( this.saldo - valor) - 5.00;
		return saldo ;
			
	}
	
	public double deposit (double valor) {
		
		this.saldo = this.saldo + valor;
		return saldo ;
	}
	
	public void depositInitial(double valor) {
		this.saldo = saldo + valor;
		System.out.println(saldo);
		
			
	}
	
	public void accountNumber(int numConta) {
		System.out.println(numConta);
		
	}
	
	public String toString() {
		return titularConta + " ,Holder, Balance: $" + String.format("%.2f", saldo);
	}

	
}
