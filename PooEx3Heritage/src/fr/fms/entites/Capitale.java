package fr.fms.entites;

public class Capitale extends City {
	private String monument;

	public Capitale(String name, String country, int nbInhabitants, String monument) {
		super(name, country, nbInhabitants);
		setMonument(monument);
	}

	/*****methods******/
	@Override
	public String toString() {
		if(getNbInhabitants() != 0) {
			return super.toString() + ", monument : " + getMonument();
		} else {
			return super.toString() + ", monument : " + getMonument();
		}
	}
	
	/*******getters & setters********/
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
}
