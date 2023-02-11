package Inheritance;


public class BonusPointAccount_inheritance {
	 public static void main(String args[]) {
		 BonusPointAccount obj = new BonusPointAccount("333-33-333333", "김미영", 0, 0);
		 obj.deposit(1000000); 
		 System.out.println("잔액:" + obj.balance);
		 System.out.println("누적 포인트:" + obj.bonusPoint);
//		 try {
//			 obj.withdraw(100); // 예외가 발생할 수 있는 아이라서 예외처리를 해줘야 함
//			 System.out.println("잔액:" + obj.balance);
//		 }
//		 catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 } 
		 
//		 Account_update obj1 = new Account_update("AAAA", "AAAA", 10);
	 }
}
