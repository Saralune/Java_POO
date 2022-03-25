
public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		//City bayonne = new City("Bayonne", "France", 65080);
		City rabat = new City("Rabat", "Maroc", 577000);

		//1.1
		//System.out.println(toulouse.nbInhabitants);
		//toulouse.nbInhabitants = 20000;
		
		//toulouse.setNbInhabitants(-20000);
		
		//1.2
		System.out.println(toulouse.getNbInhabitants());
		
		//toulouse.sumNbInhabitants(-100000);
		toulouse.setNbInhabitants(500000);
		System.out.println(toulouse.getNbInhabitants());
		
		System.out.println();
		
		//1.3
		City paris = new City("Paris", 2148271);
		paris.displayCity();
		rabat.displayCity();
		
		System.out.println();
		
		//1.4
		paris.display();
		toulouse.display();
		
		System.out.println();
		
		//1.5
		System.out.println("1.5 -> System.out.println(toulouse); renvoie une 'adresse', parce que ce n'est pas une chaine de caractères. "
				+ "\nOn ne lui a pas dit clairement les inforamations qu'on voulait voir affichées.");
	
		System.out.println();
		
		//1.6
		System.out.println(toulouse + "\n");
		
		//1.7
		System.out.println("La classe City a été instanciée " + City.nbInstance + " fois.");
	}

}
