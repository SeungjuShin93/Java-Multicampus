package Access_control_modifier;

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	protected int getX() { // ���⿡ ���� �����ڴ� public�� protected�� ��� ����
		return x;
	}
	
	protected int getY() { // ���⿡ ���� �����ڴ� public�� protected�� ��� ����
		return y;
	}
	
	protected int getZ() { // ���⿡ ���� �����ڴ� public�� protected�� ��� ����
		return y;
	}
}
