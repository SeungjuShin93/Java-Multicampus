package Reference;


 public class D_Account {
	 String accountNo; // ???¹?ȣ
	 String ownerName; // ?????? ?̸?
	 int balance; // ?ܾ?
	 
//	 Account_update(){
//		
//	 }
	 
	 D_Account(String accountNo, String ownerName, int balance) { 
		 this.accountNo = accountNo; 
		 this.ownerName = ownerName; 
		 this.balance = balance; 
	 }
	 
	 void deposit(int amount) {
		 balance += amount;
	 }
	 
	 int withdraw(int amount) throws Exception {
		 if (balance < amount)
			 throw new Exception("?ܾ??? ?????մϴ?.");
		 balance -= amount;
		 return amount;
	 }
}
