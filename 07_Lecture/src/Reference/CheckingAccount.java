package Reference;


public class CheckingAccount extends D_Account {
	 String cardNo; 
	 
//	 Account_checking(){
////		 super();
//	 }
	 
	 CheckingAccount(String accountNo, String ownerName,
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