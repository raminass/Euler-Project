package Problem17;

public class digitsCont {

	int[] digits = new int[3];

	int[][] map = { { 0, 13, 13, 15, 14, 14, 13, 15, 15, 14 }, { 0, 3, 6, 6, 5, 5, 5, 7, 6, 6 },
			{ 0, 3, 3, 5, 4, 4, 3, 5, 5, 4 }, { 0, 6, 6, 8, 8, 7, 7, 9, 8, 8 } };

	int letterTotal = 0;

	public digitsCont(int number) {

		super();
		this.digSeprator(number);

		if (digits[1] == 1 && digits[2] > 0) {

			letterTotal += map[3][digits[2]];
			letterTotal += map[0][digits[0]];

		} else {
			for (int i = 0; i < digits.length; i++) {

				letterTotal += map[i][digits[i]];

			}

		}

	}

	public int getLetterTotal() {
		return letterTotal;
	}

	private void digSeprator(int number) {

		int num = number;
		int i = 2;
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
