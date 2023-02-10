
public class I_StaticFieldExample1 {
	public static void main(String args[]) {
		 I_Accumulator obj1 = new I_Accumulator();
		 I_Accumulator obj2 = new I_Accumulator();
		 obj1.accumulate(10);
		 obj2.accumulate(20);
		 int grandTotal = I_Accumulator.getGrandTotal();
		 System.out.println("obj1.total = " + obj1.total);
		 System.out.println("obj2.total = " + obj2.total);
		 System.out.println("ÃÑ°è = " + grandTotal);
	}
}
