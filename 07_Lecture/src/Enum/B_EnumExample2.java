package Enum;

public class B_EnumExample2 {
	public static void main(String args[]) {
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");
	}
	static void printDay(String name) {
		B_Day day = B_Day.valueOf(name); 
		System.out.println(day);
	}
}
