package Enum;

public class B_EnumExample1 {
	public static void main(String args[]) {
		B_Day days[] = B_Day.values(); 
		for (B_Day day : days)
			System.out.println(day);
			System.out.println(days.length);
		}
}
