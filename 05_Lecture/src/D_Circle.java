

public class D_Circle {
	D_Circle(double radius) { // 생성자
		 this.radius = radius;
	}
	 
	double getArea() { // 메소드
	double area;
	area = radius * radius * 3.14;
	return area;
	}
		 
	double radius; // 필드
}
// 생성자 메소드 필드는 위치 순서가 상관이 없다.