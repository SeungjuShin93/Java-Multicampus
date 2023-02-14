package String;

public class StringExample3 {
	public static void main(String args[]) {
		String str1 = new String("자바");
		String str2 = new String("자바");
		if (str1 == str2) // 객체의 주소를 비교
			System.out.println("같음");
		else
			System.out.println("다름");
		System.out.println();
		
		if (str1.equals(str2)) // 객체 안에 들어 있는 값을 비교
		System.out.println("같음");
		else
		System.out.println("다름");
	}
}
