package soup3;

public class Potatoe extends Vegetable implements Quantifiable {
	
	 
	private int nbre_germe; 
	private double epluchure = 0.01;
	
	
	public Potatoe(double poids, int nbre_germe) {
		super(poids);
		this.nbre_germe = nbre_germe;
	}
	
	
	public Potatoe(double poids)
	{
		super(poids); 
		this.nbre_germe = (int)(poids*10);
		
	}
	
	public int getGerme()
	{
		return (int)(this.poids*10);
	}
	
	
	public int getCalories()
	{
		double res = 0;
		
		double poidES=0;
		
		poidES = super.getPoids() - getPeelingWeight();
		
		poidES = poidES *10;
		
		res = poidES * 80;
		res = res -5*nbre_germe;
		
		return (int) Math.round(res); 
		
		
		
		
	}


	@Override
	public String toString() {
		if(nbre_germe  == 1)
		return "Potatoe:[" + this.getCalories() + " calories"+ " - "+  super.getPoids() + "Kg" + " - " + nbre_germe +" oeil "+ "]";
		return "Potatoe:[" + this.getCalories() + " calories"+ " - " +super.getPoids() + "Kg" + " - " + nbre_germe +" yeux "+ "]";
		
	}


	@Override
	public int compareTo(Vegetable o) {
		
		return 0;
	}
	
	@Override
	public  double getPeelingWeight() {
		double res = 0;
		res = super.getPeelingWeight(); 
		res += nbre_germe*epluchure;
		
		return res;
	}
	
	
	
	
	

}
