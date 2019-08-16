package soup4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;




public class Soup {
	
	private  List<Vegetable> soup = new ArrayList<Vegetable>();
	
	
	
	public Soup() {
		
	}
	
	public void add(Vegetable e)
	{
		Objects.requireNonNull(e, "Object Vegetable not Null");
		
		soup.add(e);
	}
	

	
	public double getPeelingWeight()
	{
		double res = 0;
		for(Vegetable v : soup)
		{
			res += v.getPeelingWeight();
			
		}
		
		return res; 
		
	}
	
	
	
	@Override
	public String toString()
	{
		String s = "Soup\n ---\n";
		s += String.valueOf(getCalories());
		s+="calories";
		s += "\n";
		Iterator<Vegetable> it = soup.iterator();
		while(it.hasNext()) {
			Vegetable temp = it.next();
			s+= temp.toString();
			s+="\n";
		}
		return s;
	}

	public double getCalories() {
		int calories = 0; 
		Iterator<Vegetable> it = soup.iterator();
		
		while(it.hasNext()) {
			calories += it.next().getCalories();
			
		}
		
		return calories;
		
		

	}

	public  void sort() {
		Collections.sort(soup, ComparatorVegetable.CALORIE_ORDER);
		
		
		
	}

	
	

}
