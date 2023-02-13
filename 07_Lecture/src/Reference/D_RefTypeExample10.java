package Reference;

public class D_RefTypeExample10 {
	public static void main(String args[]) {
		D_Account obj1 = new D_Account("AAA", "AAA", 10);
//		CheckingAccount obj2 = (CheckingAccount)obj1; // 얘는 원객체가 Account라 안됨
		D_Account obj2 = new CheckingAccount("111-22-33333333", "홍길동", 100000, "5555-6666-7777-8888");
//		CheckingAccount obj2 = (CheckingAccount)obj1; //
		if (obj1 instanceof CheckingAccount) // obj1대신 2를 넣으면 가능, 1은 불가능
			pay((CheckingAccount) obj1); // obj1대신 2를 넣으면 가능, 1은 불가능
		else
			System.out.println("캐스트할 수 없는 타입입니다.");
		}
		static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000); 
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		}
		catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}
