package Inheritance;
public class BonusPointAccount extends Account_update{
	 int bonusPoint; // ���� ����Ʈ
	 
	 BonusPointAccount(String accountNo, String ownerName, int balance,
	 int bonusPoint) {
		 super(accountNo, ownerName, balance);
		 this.bonusPoint = bonusPoint;
	 } 
	 
	 @Override // ������̼� �̶�� ��, �������̵�� ������ �� ���� �˷��ִ� ����
	 void deposit(int amount) { // �����Ѵ�
		 super.deposit(amount); 
		 bonusPoint += (int) (amount * 0.001);
	 }
}
