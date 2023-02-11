package Inheritance;
public class BonusPointAccount extends Account_update{
	 int bonusPoint; // 누적 포인트
	 
	 BonusPointAccount(String accountNo, String ownerName, int balance,
	 int bonusPoint) {
		 super(accountNo, ownerName, balance);
		 this.bonusPoint = bonusPoint;
	 } 
	 
	 @Override // 어노테이션 이라고 함, 오버라이드로 재정의 된 것을 알려주는 역할
	 void deposit(int amount) { // 예금한다
		 super.deposit(amount); 
		 bonusPoint += (int) (amount * 0.001);
	 }
}
