package Inheritance;


public class Account_checking extends Account_update {
	 String cardNo; 
	 
//	 Account_checking(){
////		 super();
//	 }
	 
	 Account_checking(String accountNo, String ownerName,
		 int balance, String cardNo) { // ������
//		 super();
		 super(accountNo, ownerName, balance); // �ڵ����� super(); ������ �ȵ� ����
//		 this.accountNo = accountNo;
//		 this.ownerName = ownerName;
//		 this.balance = balance;
		 this.cardNo = cardNo;
	 }
	 
	 int pay(String cardNo, int amount) throws Exception { 
		 if (!cardNo.equals(this.cardNo) || (balance < amount))
			 throw new Exception("������ �Ұ����մϴ�.");
		 return withdraw(amount);
	 }
}