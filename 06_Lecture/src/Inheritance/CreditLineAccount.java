package Inheritance;
public class CreditLineAccount extends Account_update {
	 int creditLine; // 마이너스 한도
	 
	 CreditLineAccount(String accountNo, String ownerName,
	 int balance, int creditLine) {
		 super(accountNo, ownerName, balance);
		 this.creditLine = creditLine;
	 } 
	 
	 int withdraw(int amount) throws Exception {
		 if ((balance + creditLine) < amount) 
			 throw new Exception("인출이 불가능합니다."); 
		 balance -= amount;
		 return amount;
	 }
}
