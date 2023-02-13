package Reference;


public class CheckingAccount extends D_Account {
	 String cardNo; 
	 
//	 Account_checking(){
////		 super();
//	 }
	 
	 CheckingAccount(String accountNo, String ownerName,
		 int balance, String cardNo) { // 생성자
//		 super();
		 super(accountNo, ownerName, balance); // 자동으로 super(); 삽입이 안될 것임
//		 this.accountNo = accountNo;
//		 this.ownerName = ownerName;
//		 this.balance = balance;
		 this.cardNo = cardNo;
	 }
	 
	 int pay(String cardNo, int amount) throws Exception { 
		 if (!cardNo.equals(this.cardNo) || (balance < amount))
			 throw new Exception("지불이 불가능합니다.");
		 return withdraw(amount);
	 }
}