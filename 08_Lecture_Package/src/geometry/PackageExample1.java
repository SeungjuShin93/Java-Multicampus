package geometry;

//import library.Lendable;

public class PackageExample1 {
	public static void main(String[] args) {
		Circle obj = new Circle(5);
//		Lendable obj2 = null; // Ctrl + Shift + 'o' �ٸ� ��Ű���� �ִ� �� ���
		System.out.println("������ = " + obj.radius);
		System.out.println("���� = " + obj.getArea());
	}
}
