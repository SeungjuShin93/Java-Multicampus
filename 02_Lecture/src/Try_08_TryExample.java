package Lecture_02;

public class Try_08_TryExample {
	public static void main(String args[]) {
		 int divisor[] = { 5, 4, 3, 2, 1, 0 };
		 for (int cnt = 0; cnt < 10; cnt++) {
			 try { 
				 int share = 100 / divisor[cnt]; 
				 System.out.println(share);
			 }
			 catch (java.lang.ArithmeticException e) {
				 System.out.println("�߸��� �����Դϴ�. => " + e.getMessage());
			 }
			 catch (java.lang.ArrayIndexOutOfBoundsException e) {
				 System.out.println("�߸��� �ε����Դϴ�. => " + e.getMessage());
		 	}
			 catch (java.lang.Exception e) { // ��� ���ܸ� �� �� �����Ƿ� �ۼ��� ���
				 // ��� ������ ���� ū �θ�� Exception
				 // �̰� �ϳ��ε� ��� ����ó�� ���� ��
				 System.out.println("�� �� ���� �����Դϴ�. => " + e.getMessage());
		 	}
		 }
		 System.out.println("Done.");
	 }

}
