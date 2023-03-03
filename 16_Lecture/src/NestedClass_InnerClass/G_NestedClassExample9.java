package NestedClass_InnerClass;

class G_NestedClassExample9 {
	public static void main(String args[]) {
		F_MessageSender obj = new F_MessageSender() {
			void send(String message) {
				System.out.println("발신: 마이다스");
				System.out.println("수신: 빌 게이츠");
				System.out.println("메시지: " + message);
				System.out.println();
			}
		}; // 세미콜론 ; 꼭 붙여야 함, anonymous inner class 이름 없는 이너 클래스라고 부름
		// 1회성 목적으로만 사용, 객체 이름이 없기 때문에 재사용이 안됨, 이것이 익명 로컬 이너 클래스
		obj.send("굿 모닝");
	}
}