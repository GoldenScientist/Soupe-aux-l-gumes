package soup4;

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
	
	public int getCalories()
	{
		double res = 0;
		
		double poidES=0;
		
		poidES = super.getPoids() - getPeelingWeight();
		
		poidES = poidES *10;
		
		res = poidES * 40;
		
		return (int) Math.round(res); 
		
		
		
		
	}


	@Override
	public String toString() {
		return "Carrot:[" + this.getCalories() + " calories" + " - "+ super.getPoids() + "Kg"+ " - " + longueur + " cm"+ "]";
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
