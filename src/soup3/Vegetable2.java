package soup3;

abstract public class Vegetable implements Comparable<Vegetable>{
	
	
	protected double poids = 0;
	private int germe = 0;
	private  static  double peelinweight = 0.1;
	
	
	public Vegetable(double poids) {
		this.poids = poids;
	}
	
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public  double getPoids()
	{
		return poids;
	}
	
	public void setGerme(int germe) {
		this.germe = germe;
	}
	
	public int getGerme() {
		return germe;
	}
	
	public int CompareTo(Vegetable vegetable) {
		return 0;
	}
	public static void setPeelingWeight(double i){

		if(i < 1)
		{
			peelinweight = i;
		}

	}
	
	public  double getPeelingWeight() {
		return peelinweight*getPoids();
	}

	public int getCalories() {
		
		return 0;
	}
	

}
