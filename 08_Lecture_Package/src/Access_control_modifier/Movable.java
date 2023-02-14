package Access_control_modifier;

interface Movable {
	void moveTo(int x, int y); // 이 메소드에는 컴파일할 때 자동으로
	// public abstract 키워드가 붙습니다, 이걸 상속 받은 아이는 무조건 public 기술
}
