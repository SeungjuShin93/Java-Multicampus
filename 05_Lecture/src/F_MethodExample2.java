
public class F_MethodExample2 {
	public static void main(String args[]) {
		 int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		 F_Numbers obj = new F_Numbers(arr);
		 int total = obj.getTotal();
		 int average = obj.getAverage();
		 System.out.println("�հ� = " + total);
		 System.out.println("��� = " + average);
	}
}
