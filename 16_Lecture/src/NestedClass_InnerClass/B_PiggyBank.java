package NestedClass_InnerClass;
class B_PiggyBank { // 돼지 저금통 클래스
	int total;
	Slot slot;

	B_PiggyBank() {
		total = 0;
		slot = new Slot();
	}

	class Slot { // 입구 클래스
		void put(int amount) {
			total += amount;
		}
	}
}