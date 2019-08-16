package soup4;

import java.util.Comparator;

public interface ComparatorVegetable {
	
	static final Comparator<Vegetable> CALORIE_ORDER = new Comparator<Vegetable>() {
		public int compare(Vegetable v1, Vegetable v2) {
			int calories1 = v1.getCalories(); 
			int calories2 = v2.getCalories();

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
	};
	

}