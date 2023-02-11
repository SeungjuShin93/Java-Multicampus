package Interface;
// 인터페이스는 추상메서드만 사용 가능
public interface Lendable {
	 void checkOut(String borrower, String date) throws Exception;
	 public abstract void checkIn(); // public abstract 생략해도 컴파일 시 자동 삽입
}
