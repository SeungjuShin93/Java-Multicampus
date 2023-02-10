

public class C_ConstrExample2 {
	public static void main(String args[]) {
		C_SubscriberInfo obj1, obj2; 
		obj1 = new C_SubscriberInfo("연흥부", "poorman", "zebi");
		obj2 = new C_SubscriberInfo("연놀부", "richman", "money",
				"02-000-0000", "타워팰리스");
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
//		SubscriberInfo obj3 = new SubscriberInfo();
	}
	static void printSubscriberInfo(C_SubscriberInfo obj) {
		System.out.println("이름:" + obj.name); 
		System.out.println("아이디:" + obj.id); 
		System.out.println("패스워드:" + obj.password); 
		System.out.println("전화번호:" + obj.phoneNo); 
		System.out.println("주소:" + obj.address); 
		System.out.println();
	}

}
