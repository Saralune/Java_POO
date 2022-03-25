package fr.fms.entites;

public class Commerciale extends Person {
	private double perCA;

	/***constructors****/
	public Commerciale(double perCA) {
		super();
		setPerCA(perCA);
	}

	/***methods****/
	@Override
	public String toString() {
		return super.toString() + ", %CA : " + getPerCA();
	}

	/***getters & setters****/
	public double getPerCA() {
		return perCA;
	}

	public void setPerCA(double perCA){
		if(perCA > 0) {
			this.perCA = perCA;
		} else {
			System.out.println("Le pourcentage du CA ne peut �tre inf�rieur � 0. Valeur par d�faut 1,0 %.");
			this.perCA = 1.0;
		}
		
	}
}
