
public class E_MethodExample1 {
	public static void main(String args[]) {
		 E_Account obj1 = new E_Account("111-222-33333333", "김영식", 200000);
		 E_Account obj2 = new E_Account("555-666-77777777", "박진희", 1000000);
		 obj1.deposit(1000000);
		 obj2.withdraw(200000);
		 printAccount(obj1);
		 printAccount(obj2);
	}
	static void printAccount(E_Account obj) {
		 System.out.println("계좌번호:" + obj.accountNo); 
		 System.out.println("예금주 이름:" + obj.ownerName); 
		 System.out.println("잔액:" + obj.balance); 
		 System.out.println(); // 줄 바꿈 문자 출력
	}
}
