package Lecture_02;

public class Luxury_07_HelloJava {
	public static void main(String args[]) {
		 System.out.println(printCharacter('*', 30));
		 System.out.println("Hello, Java");
		 printCharacter('-', 30);
		
		 }
	 static int printCharacter(char ch, int num) {
		 for (int cnt = 0; cnt < num; cnt++)
			 System.out.print(ch);
		 System.out.println();
		 return 100;
	 }
	 
}
