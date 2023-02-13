package Reference;

public class D_RefTypeExample8 {
	public static void main(String args[]) {
		D_Account obj1 = new D_Account("AAA", "AAA", 10);
//		CheckingAccount obj2 = (CheckingAccount)obj1; // 얘는 원객체가 Account라 안됨
		D_Account obj = new CheckingAccount("111-22-33333333",
		"홍길동", 100000, "5555-6666-7777-8888"); // 원 객체의 데이터가 사라지는 것은 아니고
		// 접근 가능한 것만 나타내준다고 이해하면 됨
		CheckingAccount obj2 = (CheckingAccount)obj; 
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000); 
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj2.cardNo);
			System.out.println("계좌번호: " + obj2.accountNo);
		}
		catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}
