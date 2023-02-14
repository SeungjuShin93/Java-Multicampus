package Access_control_modifier;

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	protected int getX() { // 여기에 접근 제한자는 public과 protected만 사용 가능
		return x;
	}
	
	protected int getY() { // 여기에 접근 제한자는 public과 protected만 사용 가능
		return y;
	}
	
	protected int getZ() { // 여기에 접근 제한자는 public과 protected만 사용 가능
		return y;
	}
}
