
public class TestPerson {

	public static void main(String[] args) {
		City cityManu = new City("Amiens", "France");
		
		Person manu = new Person("Macron", "Emmanu", 43, "Elysée", cityManu);
		Person poutine = new Person("Poutine", "Vladi", 68);
		Person biden = new Person("Biden","Jo");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
	}

}
