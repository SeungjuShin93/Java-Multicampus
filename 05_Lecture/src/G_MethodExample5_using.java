
public class G_MethodExample5_using {
	public static void main(String args[]) {
		G_MethodExample5 obj = new G_MethodExample5("777-777-77777777", "최대박", 10);
		 try {
			 int amount = obj.withdraw(100000000); 
			 System.out.println("인출액:" + amount);
		 }
		 catch (Exception e) { 
			 String msg = e.getMessage();
			 System.out.println(msg);
		 }
	}
}
