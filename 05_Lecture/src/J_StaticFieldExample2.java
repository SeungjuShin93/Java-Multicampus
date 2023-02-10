
public class J_StaticFieldExample2 {
	public static void main(String args[]) {
		 J_LimitedValue v = new J_LimitedValue();
		 v.setValue(200000);
		 System.out.println("v.value = " + v.value);
		 System.out.println("상한값 = " + J_LimitedValue.UPPER_LIMIT);
		 System.out.println("상한값 = " + v.UPPER_LIMIT);
		 }
}
