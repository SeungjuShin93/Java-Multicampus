package Lecture_02;

public class Break_06_Example2 {
	public static void main(String args[]) {
		/* for (int row = 0; row < 3; row++) {
			 for (int col = 0; col < 5; col++) {
				 	System.out.println("(" + row + ", " + col + ")");
				 	if ((row == 1) && (col == 3))
				 		break;
			 }
		 }
		 System.out.println("Done.");
	} */
		loop1:
		for (int row = 0; row < 3; row++) {
			loop2:
				for (int col = 0; col < 5; col++) {
				 	System.out.println("(" + row + ", " + col + ")");
				 	if ((row == 1) && (col == 3))
				 		break loop1;
			 }
		 }
		 System.out.println("Done.");
	}
}
