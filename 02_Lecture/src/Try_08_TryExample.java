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
				 System.out.println("잘못된 연산입니다. => " + e.getMessage());
			 }
			 catch (java.lang.ArrayIndexOutOfBoundsException e) {
				 System.out.println("잘못된 인덱스입니다. => " + e.getMessage());
		 	}
			 catch (java.lang.Exception e) { // 모든 예외를 알 순 없으므로 작성한 경우
				 // 모든 예외의 가장 큰 부모는 Exception
				 // 이거 하나로도 모든 예외처리 가능 함
				 System.out.println("알 수 없는 오류입니다. => " + e.getMessage());
		 	}
		 }
		 System.out.println("Done.");
	 }

}
