
public class City {
	private String name;
	private String country;
	private int nbInhabitants;
	
	public static final String UNKNOWN = "unknown";
	public static int  nbInstance = 0;
	
	/****constructeur****/
	/*public City(String name, String country, int nbInhabitants) {
		super();
		this.name = name;
		this.country = country;
		this.nbInhabitants = nbInhabitants;
	}*/
	
	public City(String name, String country, int nbInhabitants) {
		setName(name);
		setCountry(country);
		setNbInhabitants(nbInhabitants);
		nbInstance++;
	}
	
	public City(String name, String country) {
		setName(name);
		setCountry(country);
		setNbInhabitants(0);
	}
	
	public City(String name, int nbInhabitants) {
		setCountry(UNKNOWN);
		setName(name);
		setNbInhabitants(nbInhabitants);
		nbInstance++;
	}
	
	/****methodes****/
	
	//if user wants to sum or substract nb from nbInhabitants
	/*public void sumNbInhabitants(int nb) {
		if(nb > 0) {
			int newNb = getNbInhabitants() + nb;
			setNbInhabitants(newNb);
		}
		
	}*/
	
	public void displayCity() {
		System.out.println(
				"[ville : " + getName() + "]" +
				"[pays : " + country + "]" +
				"[nombre d'habitants : " + getNbInhabitants() + "]"
				);
	}
	
	public void display() {
		if(!country.equals("unknown")) {
			System.out.println("La ville de " + name + 
					" en " + country + 
					" ayant " + nbInhabitants + " habitants.");
		} else {
			System.out.println("La ville de " + name + 
					" ayant " + nbInhabitants + " habitants.");
		}
	}
	
	/*@Override
	public String toString() {
		String str = "";
		
		if(!getCountry().equals("unknown")) {
			str = "La ville de " + getName() + 
					" en " + getCountry() + 
					" ayant " + getNbInhabitants() + " habitants.";
		} else {
			str = "La ville de " + getName() + 
					" ayant " + getNbInhabitants() + " habitants.";
		}
		return str;
	}*/
	
	/*
	@Override
	public String toString() {
		return "City [name = " + getName() +
				", state = " + getCountry() + 
				", nbInhabitants = " + getNbInhabitants() + "]";
	}*/
	
	@Override
	public String toString() {
		if(getNbInhabitants() != 0) {
			return "Ville de naissance : " + getName() + ", " + getCountry() + ", population de " + getNbInhabitants() + " habitants";
		} else {
			return "Ville de naissance : " + getName() + ", " + getCountry();
		}
		
	}
	
	public static int getNbInstance() {
		return nbInstance;
	}
	
	/****getters & setters****/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNbInhabitants() {
		return nbInhabitants;
	}

	public void setNbInhabitants(int nbInhabitants) {
		if(nbInhabitants >= this.nbInhabitants) {
			this.nbInhabitants = nbInhabitants;
		} else {
			throw new RuntimeException("Le nombre d'habitant ne peut être négatif et doit être supérieur au nombre actuel d'habitants.");
		}
	}

}
