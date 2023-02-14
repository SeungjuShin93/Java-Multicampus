package String;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		while (stok.hasMoreTokens()) {
			String str = stok.nextToken();
			System.out.println(str);
		} System.out.println();
		
		StringTokenizer stok2 = new StringTokenizer("사과, 배, 복숭아", ", ");
		while (stok2.hasMoreTokens()) {
			String str = stok2.nextToken();
			System.out.println(str);
		} System.out.println();
		
		StringTokenizer stok3 = new StringTokenizer("사과,배, 복숭아");
		while (stok3.hasMoreTokens()) {
			String str = stok3.nextToken();
			System.out.println(str);
		} System.out.println();
		
		StringTokenizer stok4 = new StringTokenizer("사과,배|복숭아", ",|");
		while (stok4.hasMoreTokens()) {
			String str = stok4.nextToken();
			System.out.println(str);
		}
	}
}