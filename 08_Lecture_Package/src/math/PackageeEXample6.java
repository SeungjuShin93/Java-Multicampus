package math;

//import geometry.polygon.Rectangle;
//import geometry.polygon.Square;
import geometry.polygon.*; // �� ��Ű���� �ִ� Ŭ������ import

class PackageExample6 {
	public static void main(String args[]) {
	Square obj1 = new Square(7); 
	Rectangle obj2 = new Rectangle(5, 10); 
	if (obj1.getArea() > obj2.getArea())
		System.out.println("���簢���� ������ �� �н��ϴ�."); 
	else
		System.out.println("���簢���� ������ ���簢���� �������� �۰ų� �����ϴ�."); 
	}
}
