package soup2;

public class Carrot extends Vegetable {
	
	private double poids; 
	private double longueur; 
	
	
	public Carrot(double poids, double longueur) {
		super(poids); 
		this.longueur = longueur; 
	}
	
	

	public double getPoidsP() {
		return poids;
	}


	@Override
	public String toString() {
		return "Carrot [" + super.getPoids() + "Kg"+ " - " + longueur + " cm"+ "]";
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public double getLongueur() {
		return longueur;
	}


	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}



	@Override
	public int compareTo(Vegetable o) {
		
		return 0;
	}
	
	
	
	

}
