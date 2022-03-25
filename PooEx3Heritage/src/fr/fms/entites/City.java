package fr.fms.entites;

public class City {
	private String name;
	private String country;
	private int nbInhabitants;
	
	public static final String UNKNOWN = "unknown";
	
	/*****constructors******/
	public City(String name, String country, int nbInhabitants) {
		setName(name);
		setCountry(country);
		setNbInhabitants(nbInhabitants);
	}

	/*****methods******/
	@Override
	public String toString() {
		if(getNbInhabitants() != 0) {
			return "Ville de naissance : " + getName() + ", " + getCountry() + ", " + getNbInhabitants() + " habitants";
		} else {
			return "Ville de naissance : " + getName() + ", " + getCountry();
		}
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
