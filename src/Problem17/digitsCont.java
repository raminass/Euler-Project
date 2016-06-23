package Problem17;

import java.util.Map;

public class digitsCont {

	int[] digits = new int[4];
	int letterTotal = 0;
	Map<int, int> numToWord= new HashMap();
	

	

	public digitsCont(int number) {
		super();
		this.digSeprator(number);
		
	}

	private void digSeprator(int number) {

		int num = number;
		int i = 3;
		while (i >= 0) {

			this.digits[i] = num % 10;
			num /= 10;
			i--;

		}

	}

	public int[] getDigits() {
		return digits;
	}
	
	

}
