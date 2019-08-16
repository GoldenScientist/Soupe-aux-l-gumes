package soup4;

public class Test {

	public static void main(String[] args) {
		
		Soup s = new Soup();
		s.add(new Potatoe(0.3, 10));
		s.add(new Carrot(0.25, 30));
		s.add(new Potatoe(0.500));
		s.add(new Carrot(0.20, 25));
		s.add(new Potatoe(0.450, 2));
		System.out.println(s);
		// tri
		s.sort();
		System.out.println(s);
		

	}

}
