package NestedClass_InnerClass;

class I_MP3PlayerFactory extends I_PlayerFactory {
	public Player createPlayer() {
		return new MP3Player();
	}

	class MP3Player implements Player {
		public void play(String source) {
			System.out.println("�÷��� ����: " + source);
		}

		public void stop() {
			System.out.println("�÷��� ����");
		}
	}
}