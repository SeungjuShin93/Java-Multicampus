package Reference;

public class D_RefTypeExample10 {
	public static void main(String args[]) {
		D_Account obj1 = new D_Account("AAA", "AAA", 10);
//		CheckingAccount obj2 = (CheckingAccount)obj1; // ��� ����ü�� Account�� �ȵ�
		D_Account obj2 = new CheckingAccount("111-22-33333333", "ȫ�浿", 100000, "5555-6666-7777-8888");
//		CheckingAccount obj2 = (CheckingAccount)obj1; //
		if (obj1 instanceof CheckingAccount) // obj1��� 2�� ������ ����, 1�� �Ұ���
			pay((CheckingAccount) obj1); // obj1��� 2�� ������ ����, 1�� �Ұ���
		else
			System.out.println("ĳ��Ʈ�� �� ���� Ÿ���Դϴ�.");
		}
		static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("5555-6666-7777-8888", 47000); 
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj.cardNo);
		}
		catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}
