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
	public void moveTo(int x, int y) { // �������̽��� ��� �޾ұ� ������ ������ public ���
		this.x = x;
		this.y = y;
	}
}
