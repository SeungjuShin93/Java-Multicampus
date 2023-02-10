

public class C_SubscriberInfo {
	 String name, id, password;
	 String phoneNo, address;
	 
//	 SubscriberInfo(){
//	
//	 }
	 C_SubscriberInfo(String name, String id, String password) {
	 this.name = name; 
	 this.id = id; 
	 this.password = password; 
	 }
	 C_SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
	 this.name = name; 
	 this.id = id; 
	 this.password = password; 
	 this.phoneNo = phoneNo;
	 this.address = address;
	 }
	 
	 void changePassword(String password) {
	 this.password = password; 
	 }
	 void setPhoneNo(String phoneNo) {
	 this.phoneNo = phoneNo;
	 }
	 void setAddress(String address) {
	 this.address = address;
	 }
}
