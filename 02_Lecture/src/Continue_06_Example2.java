package Lecture_02;

public class Continue_06_Example2 {
	public static void main(String args[]) {
		 int cnt = 0;
		 while (cnt < 10) {
			 if (cnt == 5)
				 continue;
			 System.out.println(cnt);
			 cnt++;
		 }
		 System.out.println("Done.");
		 }
}
