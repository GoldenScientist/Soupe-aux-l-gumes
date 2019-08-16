package soup3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Potatoe p1 = new Potatoe(0.3, 10);
		System.out.println(p1.getCalories());   // affiche: 86
		Carrot c1 = new Carrot(0.25, 30);
		System.out.println(c1.getCalories());   // affiche: 90
		Soup s = new Soup();
		s.add(p1);
		s.add(c1);
		System.out.println(s.getCalories()); // affiche: 176
		
		
		// les objets quantifiables
		 System.out.println("Les quantifiables : ");
		 Quantifiable quantifiables [] = {p1, c1, s};
		 for (Quantifiable quantifiable : quantifiables){
		 System.out.println(quantifiable);
		 }
		

	}

}
