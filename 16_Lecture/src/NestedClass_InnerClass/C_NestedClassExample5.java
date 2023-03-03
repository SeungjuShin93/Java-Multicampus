package NestedClass_InnerClass;
class C_NestedClassExample5 {
	public static void main(String args[]) {
		C_Line line = new C_Line(0, 0, 100, 100);
		line.move(10, 20);
		printPoint(line.point1);
		printPoint(line.point2);
//		Line.Point point = new Line.Point(100, 200);
//		printPoint(point);
	}

	static void printPoint(C_Line.Point point) {
		System.out.printf("(%d, %d) %n", point.x, point.y);
	}
}
