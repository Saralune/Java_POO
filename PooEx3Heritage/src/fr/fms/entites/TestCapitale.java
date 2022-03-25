package fr.fms.entites;

public class TestCapitale {

	public static void main(String[] args) {
		Capitale paris = new Capitale("Paris", "France", 2000000, "Tour Effiel");
		Capitale london = new Capitale("Londres", "GB", 9400000, "Big Ben");
		
		System.out.println(paris);
		System.out.println(london);
	}

}
