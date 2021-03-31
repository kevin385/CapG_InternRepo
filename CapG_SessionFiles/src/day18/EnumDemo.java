package day18;

class day {
	public static final day sun = new day();
	public static final day mon = new day();
	public static final day tuesday = new day();
}




public class EnumDemo {
	enum days {
		sun(4), mon(5), tues(8), wed(9), thurs(2), fri(4), sat(6);
		int hours;

		private days(int hours) {
			this.hours = hours;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}
		
	}

	public static void main(String[] args) {
		days d = days.mon;
		System.out.println(d);
		
		for (days day1: days.values()) {
			System.out.println(day1);
		}
		System.out.println("=====Switch Demo=====");
		switch (d) {
		case mon:
			System.out.println("Monday");
			System.out.println(d.getHours());
			break;
		case sun:
			System.out.println("Sunday");
			System.out.println(d.getHours());
			break;
		case tues:
			System.out.println("Tuesday");
			System.out.println(d.getHours());
			break;
		case wed:
			System.out.println("Wednesday");
			System.out.println(d.getHours());
			break;
		case thurs:
			System.out.println("Thursday");
			System.out.println(d.getHours());
			break;
		case fri:
			System.out.println("Friday");
			System.out.println(d.getHours());
			break;
		case sat:
			System.out.println("Saturday");
			System.out.println(d.getHours());
			break;
		}
		
	}

}
