package Reference;

public class C_RefTypeExample2 {
	public static void main(String args[]) {
		C_Point obj = new C_Point(10, 20);
		System.out.printf("(%d, %d) %n", obj.x, obj.y);
		rearrange(obj);
		System.out.printf("(%d, %d) %n", obj.x, obj.y);
	}
		
	static void rearrange(C_Point point) {
		point.x = 30; 
		point.y = 40; 
	}
}
