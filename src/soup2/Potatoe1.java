package soup2;

public class Potatoe extends Vegetable {
	
	private double poids; 
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


	@Override
	public String toString() {
		if(nbre_germe  == 1)
		return "Potatoe [" +  super.getPoids() + "Kg" + " - " + nbre_germe +" oeil "+ "]";
		return "Potatoe [" +  super.getPoids() + "Kg" + " - " + nbre_germe +" yeux "+ "]";
		
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
