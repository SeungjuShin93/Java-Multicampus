package String;

public class StringExample6 {
	public static void main(String args[]) {
		String str = "���� �ڱ��ϴ� �ڹ�";
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7)); // 3��° index���� 6��° index����
		for (int i=0; i<str.length(); i++)
			System.out.println(str.substring(i, i+1));
	}
}

// substring(int beginIndex)
// substring(int beginIndex, int endIndex)