package NestedClass_InnerClass;

class I_NestedIFExample1 {
	public static void main(String args[]) {
		I_MP3PlayerFactory factory = new I_MP3PlayerFactory();
		I_PlayerFactory.Player player = factory.createPlayer();
		player.play("¾Æ¸®¶û");
		player.stop();
	}
}