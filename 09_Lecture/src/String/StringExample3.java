package String;

public class StringExample3 {
	public static void main(String args[]) {
		String str1 = new String("�ڹ�");
		String str2 = new String("�ڹ�");
		if (str1 == str2) // ��ü�� �ּҸ� ��
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		System.out.println();
		
		if (str1.equals(str2)) // ��ü �ȿ� ��� �ִ� ���� ��
		System.out.println("����");
		else
		System.out.println("�ٸ�");
	}
}
