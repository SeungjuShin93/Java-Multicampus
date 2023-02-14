package Access_control_modifier;

public class PlaneLabel implements Movable {
	int x, y;
	String str;
	
	PlaneLabel(int x, int y, String str) {
		this.x = x;
		this.y = y;
		this.str = str;
	}
	
	@Override
	public void moveTo(int x, int y) { // 인터페이스를 상속 받았기 때문에 무조건 public 기술
		this.x = x;
		this.y = y;
	}
}
