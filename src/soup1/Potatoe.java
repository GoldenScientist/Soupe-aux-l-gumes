package soup1;

public class Potatoe {
	
	private double poids; 
	private int nbre_germe; 
	
	
	public Potatoe(double poids, int nbre_germe) {
		this.poids = poids;
		this.nbre_germe = nbre_germe;
	}
	
	
	public Potatoe(double poids)
	{
		this.poids = poids; 
		this.nbre_germe = (int)(poids*10);
		
	}
	
	public int getGerme()
	{
		return (int)(this.poids*10);
	}


	@Override
	public String toString() {
		
		return "Potate [" + poids + " Kg "+ " - " + nbre_germe+ " yeux "+ "]";
	}
	
	
	
	
	
	

}
