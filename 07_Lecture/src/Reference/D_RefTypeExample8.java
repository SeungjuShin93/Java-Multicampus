package Reference;

public class D_RefTypeExample8 {
	public static void main(String args[]) {
		D_Account obj1 = new D_Account("AAA", "AAA", 10);
//		CheckingAccount obj2 = (CheckingAccount)obj1; // ��� ����ü�� Account�� �ȵ�
		D_Account obj = new CheckingAccount("111-22-33333333",
		"ȫ�浿", 100000, "5555-6666-7777-8888"); // �� ��ü�� �����Ͱ� ������� ���� �ƴϰ�
		// ���� ������ �͸� ��Ÿ���شٰ� �����ϸ� ��
		CheckingAccount obj2 = (CheckingAccount)obj; 
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000); 
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj2.cardNo);
			System.out.println("���¹�ȣ: " + obj2.accountNo);
		}
		catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}
