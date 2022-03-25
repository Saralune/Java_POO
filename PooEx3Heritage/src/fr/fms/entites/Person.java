package fr.fms.entites;

public class Person {
	//att
	private String name;
	private String firstName;
	private int age;
	private String adress;
	
	private City city;
	private Capitale capitale;
	private Employee employee;
	private Commerciale commerciale;
	
	//construct
	public Person(String name, String firstName, int age, String adress, City city) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCity(city);
	}
	
	public Person(String name, String firstName, int age, String adress, Capitale capitale) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCapitale(capitale);
	}
	
	public Person(String name, String firstName, int age, String adress, City city, Employee employee) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCity(city);
		setEmployee(employee);
	}

	public Person(String name, String firstName, int age, String adress, City city, Employee employee, Commerciale commerciale) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCity(city);
		setEmployee(employee);
		setCommerciale(commerciale);
	}

	public Person() {
	}

	//methods
	@Override
	public String toString() {
		if(getCity() != null) {
			return getName() + ", " +
					getFirstName() + ", " +
					getAge() + ", " +
					"habitant " + getAdress() + "\n -> " +
					getCity();
		} else {
			return getName() + ", " +
					getFirstName() + ", " +
					getAge() + ", " + 
					"habitant " + getAdress() + "\n -> " +
					getCapitale() ;
		}

	}

	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 18) {
			this.age = age;
		} else {
			System.out.println("Un employé doit avoir 18 ans minimum. Merci de corriger votre saisie.");
			this.age = 18;
		}
		
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Capitale getCapitale() {
		return capitale;
	}

	public void setCapitale(Capitale capitale) {
		this.capitale = capitale;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Commerciale getCommerciale() {
		return commerciale;
	}

	public void setCommerciale(Commerciale commerciale) {
		this.commerciale = commerciale;
	}
	
	
}

