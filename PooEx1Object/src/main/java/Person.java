import java.util.ArrayList;

public class Person {
	//att
	private String name;
	private String firstName;
	private int age;
	private String adress;
	
	private City city;

	private static final String UNKNOWN = "unknown";
	
	//construct
	public Person(String name, String firstName, int age, String adress, City city) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCity(city);
	}
	
	public Person(String name, String firstName, int age, String adress) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
	}

	public Person(String name, String firstName, int age) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAdress(UNKNOWN);
	}

	public Person(String name, String firstName) {
		setName(name);
		setFirstName(firstName);
		setAge(0);
		setAdress(UNKNOWN);
	}

	//methods
	//toString exo1
	/*@Override
	 * public String toString() {
		return "Person [lastName = " + getName() +
				", firstName = " + getFirstName() +
				", age = " + getAge() + 
				", address = " + getAdress() + "]" +
				"Born " + this.city;
	}*/
	
	//toString exo 2
	@Override
	public String toString() {
		return getName() + ", " +
				getFirstName() + ", " +
				getAge() + ", " +
				"habitant " + getAdress() +
				getCity();
	}
	
	//filtred list
	public static String bornInFrance(ArrayList<Object> persos){
		String filtredPersos = "";
		
		for (int i = 0; i < persos.size(); i++) {
			if(persos.get(i).toString().toLowerCase().contains("france") 
					|| persos.get(i).toString().toLowerCase().contains("paris")) {
				filtredPersos += persos.get(i) + "\n";
			}
		}
		
		return filtredPersos;
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
		this.age = age;
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
}
