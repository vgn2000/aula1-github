package entidades;

public class Rooms {
	private double rent;
	private String name;
	private String email;
	
	
	public Rooms(double rent, String name, String email) {
		
		this.rent = rent;
		this.name = name;
		this.email = email;
	}


	public Rooms(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}




	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + " , " + email;
	}
	
	
	

}
