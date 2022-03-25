import java.util.ArrayList;

public class ListPerso {

	public static void main(String[] args) {
		City cityManu = new City("Amiens", "France");
		City cityNico = new City("Paris", "France", 2000000);
		City cityBoris = new City("New-York", "Etats-Unis");
		City cityGege = new City("Châteauroux", "France");
		City cityLenny = new City("New-York", "USA");
		City cityJenny = new City("Indian Hills", "USA");
		
		Person manu = new Person("Macron", "Manu", 43, "Elysée" + ", ", cityManu);
		Person nico = new Person("Sarko", "Nico", 66, "Paris" + ", ", cityNico);
		Person boris = new Person("Jonhson", "Boris", 56, "Downing Street à London" + ", ", cityBoris);
		Person gege = new Person("Depardieu", "Gérard", 78, "Moscou" + ", ", cityGege);
		Person lenny = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris" + ", ", cityLenny);
		Person jenny = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA" + ", ", cityJenny);
		
		ArrayList<Object> persos = new ArrayList<Object>();
		
		persos.add(manu);
		persos.add(nico);
		persos.add(boris);
		persos.add(gege);
		persos.add(lenny);
		persos.add(jenny);
		
		System.out.println("Liste des personnalités\n");
		for (int i = 0; i < persos.size(); i++) {
			System.out.println(persos.get(i));
		}
		
		System.out.println("\n----------------------------------------------\n");
		
		System.out.println("Liste après notre filtre\n");
		System.out.println(Person.bornInFrance(persos));
	}

}
