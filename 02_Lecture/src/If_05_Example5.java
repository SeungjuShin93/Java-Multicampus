package Lecture_02;
import java.util.Scanner; // Ctrl + Shift + 'o' 누르면 자동 삽입

public class If_05_Example5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int jumsu;
		
		System.out.print("점수 입력 => ");
		jumsu = scan.nextInt();
		
		 if (jumsu >= 90)
			 System.out.println("수");
		 else if (jumsu >= 80)
			 System.out.println("우");
		 	else if (jumsu >= 70)
		 		System.out.println("미");
		 		else if (jumsu >= 60)
		 			System.out.println("양");
		 			else
		 				System.out.println("가");
		 }
}
