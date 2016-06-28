package Problem_20;

import java.math.BigInteger;

public class test {
	
	public static void main(String[] args) {
		
		String number = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864";
		
		
		int count =0;
		
		for (int i = 0; i < number.length(); i++) {
			
			count += Integer.valueOf(number.substring(i, i+1));
			
		}
		
		System.out.println(count);
		
		
	}
	
	
	
	

}
