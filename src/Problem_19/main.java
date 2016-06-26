package Problem_19;

public class main {

	public static void main(String[] args) {

		myDate mydate = new myDate(3, 1, 1, 1901);
		int counter = 0;
		int dName;
		int dNumber;

		while (mydate.getYear() <= 2000) {

			mydate.setDayName(mydate.getDayName() + 1);
			mydate.setDay(mydate.getDay() + 1);

			System.out.println(mydate);
			if (mydate.getDayName() == 1 && mydate.getDay() == 1) {

				counter++;

			}

		}

		System.out.println(counter);

	}

}
