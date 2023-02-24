import java.util.StringTokenizer;

class SystemExample4 {
	public static void main(String args[]) {
		String str = System.getenv("path");
		StringTokenizer st = new StringTokenizer(str, ";");
		while (st.hasMoreTokens()) {
			String str2 = st.nextToken();
			System.out.println(str2);
		}
	}
}