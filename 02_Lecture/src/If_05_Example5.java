package Lecture_02;
import java.util.Scanner; // Ctrl + Shift + 'o' ������ �ڵ� ����

public class If_05_Example5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int jumsu;
		
		System.out.print("���� �Է� => ");
		jumsu = scan.nextInt();
		
		 if (jumsu >= 90)
			 System.out.println("��");
		 else if (jumsu >= 80)
			 System.out.println("��");
		 	else if (jumsu >= 70)
		 		System.out.println("��");
		 		else if (jumsu >= 60)
		 			System.out.println("��");
		 			else
		 				System.out.println("��");
		 }
}
