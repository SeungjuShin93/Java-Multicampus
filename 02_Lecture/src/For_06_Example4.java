package Lecture_02;

public class For_06_Example4 {
	public static void main(String args[]) {
		/* int arr[] = { 10, 20, 30, 40, 50 };
		 for (int cnt = 0; cnt < arr.length; cnt++) {
			 System.out.println(arr[cnt]);
		 }
		 System.out.println("Done.");
		 }
		 */
		
		// �迭�� �� ���ϱ�
		int arr[] = { 10, 20, 30, 40, 50 };
		int tot = 0;
		/*
		for (int cnt = 0; cnt < arr.length; cnt++) {
			 tot += arr[cnt];
		}
		*/
		for (int val : arr) 
			 tot += val;
		System.out.println(tot);
		System.out.println("Done.");
	}

}
