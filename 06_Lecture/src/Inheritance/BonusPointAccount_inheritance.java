package Inheritance;


public class BonusPointAccount_inheritance {
	 public static void main(String args[]) {
		 BonusPointAccount obj = new BonusPointAccount("333-33-333333", "��̿�", 0, 0);
		 obj.deposit(1000000); 
		 System.out.println("�ܾ�:" + obj.balance);
		 System.out.println("���� ����Ʈ:" + obj.bonusPoint);
//		 try {
//			 obj.withdraw(100); // ���ܰ� �߻��� �� �ִ� ���̶� ����ó���� ����� ��
//			 System.out.println("�ܾ�:" + obj.balance);
//		 }
//		 catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 } 
		 
//		 Account_update obj1 = new Account_update("AAAA", "AAAA", 10);
	 }
}
