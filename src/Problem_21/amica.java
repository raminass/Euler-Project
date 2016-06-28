package Problem_21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class amica {

	public static boolean isAmica(int number) {
		
	
		List<Integer> div1 = amica.findDivisors(number);
		int sum = amica.sum(div1);
		List<Integer> div2 = amica.findDivisors(sum);
		int sum1 = amica.sum(div2);
		
		if (number==sum1 && number!=sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static List<Integer> findDivisors(int number) {

		List<Integer> divisors = new ArrayList<>();

		for (int i = 1; i <= number / 2 + 1; i++) {
			if (number % i == 0) {

				divisors.add(i);
			}
		}

		return divisors;
	}

	
		
		

		public static int sum(List<Integer> list) {
			if (list == null || list.size() < 1)
				return 0;

			int sum = 0;
			for (Integer i : list)
				sum = sum + i;

			return sum;
		}
	
}
