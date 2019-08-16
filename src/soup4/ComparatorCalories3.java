package soup4;

import java.util.Comparator;

public class ComparatorCalories implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable o1, Vegetable o2) {

		int calories1 = o1.getCalories(); 
		int calories2 = o2.getCalories();

		if(calories1 > calories2)
		{
			return 1;
		}
		else if(calories1 < calories2)
		{
			return -1;
		}
		else
			return  0;
	}

}
