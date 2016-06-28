package Problem_21;

import java.util.ArrayList;
import java.util.List;

public class test_1 {

	public static void main(String[] args) {

		List<Integer> amicals = new ArrayList<>();
		
		
		for (int i = 3; i < 10000; i++) {
			
			if (amica.isAmica(i)) {
				
				amicals.add(i);
			}
			
		}
		
		System.out.println(amicals);
		System.out.println(amica.sum(amicals));

	}
}
