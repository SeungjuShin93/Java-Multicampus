package NestedClass_InnerClass;

interface D_PlaneObject { // ��� ���� �������̽�
	Location getLocation();

	void setLocation(int x, int y);

	static class Location { // ��ġ Ŭ����
		int x, y;

		Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
