package soup3;

import java.util.Comparator;

public class ComparatorCalories implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable o1, Vegetable o2) {
		
		if(o1.getCalories() > o2.getCalories())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
