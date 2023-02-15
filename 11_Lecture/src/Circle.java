class Circle {
	int radius; // 반지름

	Circle(int radius) {
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Circle)) // 들어오면 obj 객체를 Circle 타입으로 캐스트 연산이 가능하면 True
			return false;
		Circle circle = (Circle) obj;
		if (radius == circle.radius)
			return true;
		else
			return false;
	}
}