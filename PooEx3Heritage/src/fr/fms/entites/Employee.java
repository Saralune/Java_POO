package fr.fms.entites;

public class Employee extends Person {
	//private Person person;
	private String enterprise;
	private double pay;
		
	/***constructors****/
	public Employee(String name, String firstName, int age, String adress, Capitale capitale, String enterprise, double pay) {
		super(name, firstName, age, adress, capitale);
		setEnterprise(enterprise);
		setPay(pay);
	}
	
	public Employee(String name, String firstName, int age, String adress, City city, String enterprise, double pay) {
		super(name, firstName, age, adress, city);
		setEnterprise(enterprise);
		setPay(pay);
	}

	public Employee(String name, String firstName, int age, String adress, City city, String enterprise) {
		super(name, firstName, age, adress, city);
		setEnterprise(enterprise);
	}

	public Employee(String entreprise) {
		super();
		setEnterprise(enterprise);
	}

	/***methods****/
	@Override
	public String toString() {
		return super.toString() +  "\n -> " +  "Entreprise : " + getEnterprise() + ", salaire : " + getPay();
	}
	
	/***getters & setters****/
	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	
	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		if(pay > 0) {
			this.pay = pay;
		} else {
			System.out.println("Le salaire doit �tre positif.");
			this.pay = 10;
		}
		
	}
}
