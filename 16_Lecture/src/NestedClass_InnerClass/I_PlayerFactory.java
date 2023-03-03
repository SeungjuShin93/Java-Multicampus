package NestedClass_InnerClass;

abstract class I_PlayerFactory {
	abstract Player createPlayer();

	interface Player {
		void play(String source);

		void stop();
	}
}