package fr.fms.entites;

public class TestEmployee {

	public static void main(String[] args) {
		Employee bilou = new Employee("Gates", "Bill", 65, "USA", new Capitale("Washington", "USA", 7600000, "W-M"), "Fondation B&M Gates", 100000.0);
		Employee musky = new Employee("Musk", "Elon", 49, "Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 1500000.0);
	
		System.out.println(bilou + "\n");
		System.out.println(musky + "\n");
		
		Person rob = new Person("Dupont", "Robert", 50, "rue des rosiers à Toulouse", new City("Limoges", "France", 133000), new Employee("Brico"), new Commerciale(3.0));
		
		System.out.println(rob);
		//System.out.println(rob.getCommerciale());
	}

}
