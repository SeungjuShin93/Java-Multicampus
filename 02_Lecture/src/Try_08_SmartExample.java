package Lecture_02;

public class Try_08_SmartExample {
	public static void main(String args[]) {
		 int a = 3, b = 0;
		 int result;
		 try {
			 result = a / b;
			 System.out.println(result);
		 }
		 catch (java.lang.ArithmeticException e) {
			 System.out.println("�߸��� �����Դϴ�. => " + e.getMessage());
		 }
		 finally {
			 System.out.println("Done.");
		 } // fianlly ��������
	 }
}
