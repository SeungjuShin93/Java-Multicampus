package NestedClass_InnerClass;

class H_NestedClassExample10 {
	public static void main(String args[]) {
		H_Player obj = new H_Player() {
			public void play(String source) {
				System.out.println("�÷��� ����: " + source);
			}

			public void stop() {
				System.out.println("�÷��� ����");
			}
		};
		obj.play("LetItBe.mp3");
		obj.stop();
	}
}
