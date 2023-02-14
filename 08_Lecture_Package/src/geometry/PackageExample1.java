package geometry;

//import library.Lendable;

public class PackageExample1 {
	public static void main(String[] args) {
		Circle obj = new Circle(5);
//		Lendable obj2 = null; // Ctrl + Shift + 'o' 다른 패키지에 있는 것 사용
		System.out.println("반지름 = " + obj.radius);
		System.out.println("면적 = " + obj.getArea());
	}
}
