
public class G_MethodExample4 {
	 public static void main(String args[]) {
		 E_Account obj = new E_Account("777-777-77777777", "�ִ��", 10);
		 try {
			 int amount = obj.withdraw(100000000); 
			 System.out.println("�����:" + amount);
		 }
		 catch (Exception e) { 
			 String msg = e.getMessage();
			 System.out.println(msg);
		 }
	 }
}
