package String;

import java.util.Random;

public class RandomExample2 {
	public static void main(String args[]) {
		Random random = new Random(349239L); // seed 값이 주어졌을 때
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}
}
