class Circle {
	int radius; // ������

	Circle(int radius) {
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Circle)) // ������ obj ��ü�� Circle Ÿ������ ĳ��Ʈ ������ �����ϸ� True
			return false;
		Circle circle = (Circle) obj;
		if (radius == circle.radius)
			return true;
		else
			return false;
	}
}