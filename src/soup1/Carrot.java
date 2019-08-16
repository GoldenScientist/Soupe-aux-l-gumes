package soup1;

public class Carrot {
	
	private double poids; 
	private double longueur; 
	
	
	public Carrot(double poids, double longueur) {
		this.poids = poids; 
		this.longueur = longueur; 
	}
	
	public Carrot() {
		
	}


	public double getPoids() {
		return poids;
	}


	@Override
	public String toString() {
		return "Carrot [" + poids + "Kg"+ " - " + longueur + " cm"+ "]";
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
	
	
	
	

}
