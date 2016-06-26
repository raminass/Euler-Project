package Problem_19;

public class myDate {

	int dayName;
	int day;
	int month;
	int year;

	public myDate(int dayName, int day, int month, int year) {
		super();
		this.dayName = dayName;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int numberOfDays(int month, int year) {

		int numberOfDays = 0;

		if (month == 9 || month == 4 || month == 6 || month == 11) {

			numberOfDays = 30;

		} else if (month == 2) {

			if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {

				numberOfDays = 29;

			} else {
				numberOfDays = 28;
			}

		} else {

			numberOfDays = 31;
		}

		return numberOfDays;
	}

	public int getDayName() {
		return dayName;
	}

	public void setDayName(int dayName) {

		if (dayName > 7) {
			this.dayName = 1;
		} else {
			this.dayName = dayName;
		}

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		if (day>this.numberOfDays(this.month, this.year)) {
			
			this.day=1;
			this.setMonth(this.getMonth() + 1);
			
		}
		else {
			this.day = day;
		}

		

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if (month>12) {
			this.month=1;
			this.setYear(this.getYear()+1);
		}
		else {
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "myDate [dayName=" + dayName + ", day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
