package NestedClass_InnerClass;

class D_Rectangle implements D_PlaneObject { // 사각형 클래스
	Location location;
	int width, height;

	D_Rectangle(int x, int y, int width, int height) {
		this.location = new Location(x, y);
		this.width = width;
		this.height = height;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(int x, int y) {
		location.x = x;
		location.y = y;
	}
}
