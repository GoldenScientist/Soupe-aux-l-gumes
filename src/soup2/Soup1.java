package soup2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Soup {
	
	private List<Vegetable> soup = new ArrayList<Vegetable>();
	
	
	
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
		String result = "---\nSoupe";
		
		for (int i = 0; i <soup.size(); i++){
			
			result += "\n"+ soup.toString() +"\n"; 
			
		}
		
		return result;
	}
	

}
