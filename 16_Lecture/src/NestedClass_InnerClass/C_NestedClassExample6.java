package NestedClass_InnerClass;
class C_NestedClassExample6 {
	public static void main(String args[]) {
		C_Line.Point point = new C_Line.Point(100, 200); // 인클로징 객체에 종속될 필요가 없음
		System.out.printf("(%d, %d)", point.x, point.y);
	}
}