package Lecture_02;

public class Method_07_Example1 {
	public static void main(String args[]) {
		 printCharacter('*', 30); 
		 System.out.println("Hello, Java");
		 printCharacter('-', 30); 
	}
	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
	 }
	/* static int printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
		return 100;
	 } */

}
