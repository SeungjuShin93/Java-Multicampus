package Inheritance;
public class CreditLineAccount extends Account_update {
	 int creditLine; // ���̳ʽ� �ѵ�
	 
	 CreditLineAccount(String accountNo, String ownerName,
	 int balance, int creditLine) {
		 super(accountNo, ownerName, balance);
		 this.creditLine = creditLine;
	 } 
	 
	 int withdraw(int amount) throws Exception {
		 if ((balance + creditLine) < amount) 
			 throw new Exception("������ �Ұ����մϴ�."); 
		 balance -= amount;
		 return amount;
	 }
}
