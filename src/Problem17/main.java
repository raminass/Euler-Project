package Problem17;

public class main {

	public static void main(String[] args) {

		int total = 0;

		for (int i = 1; i <= 999; i++) {

			digitsCont test = new digitsCont(i);
			total += test.getLetterTotal();
		}

		System.out.println(total - 16);

	}
}
