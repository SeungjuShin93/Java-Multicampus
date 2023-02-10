
public class I_Accumulator {
	 int total = 0;
	 static int grandTotal = 0; // 정적 필드를 선언하는 선언문
	 
	 void accumulate(int amount) {
		 total += amount;
		 grandTotal += amount; // 정적 필드를 사용하는 명령문
	 }
	 
	 static int getGrandTotal() { // 정적 메소드 선언
//		 grandTotal = total; // total은 객체를 만들어야지만 사용할 수 있는 필드기 때문에 에러 발생
		 return grandTotal; 
	 }
}
