

public class C_ConstrExample2 {
	public static void main(String args[]) {
		C_SubscriberInfo obj1, obj2; 
		obj1 = new C_SubscriberInfo("�����", "poorman", "zebi");
		obj2 = new C_SubscriberInfo("�����", "richman", "money",
				"02-000-0000", "Ÿ���Ӹ���");
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
//		SubscriberInfo obj3 = new SubscriberInfo();
	}
	static void printSubscriberInfo(C_SubscriberInfo obj) {
		System.out.println("�̸�:" + obj.name); 
		System.out.println("���̵�:" + obj.id); 
		System.out.println("�н�����:" + obj.password); 
		System.out.println("��ȭ��ȣ:" + obj.phoneNo); 
		System.out.println("�ּ�:" + obj.address); 
		System.out.println();
	}

}
