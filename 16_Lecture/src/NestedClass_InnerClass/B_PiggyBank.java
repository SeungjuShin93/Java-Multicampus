package NestedClass_InnerClass;
class B_PiggyBank { // ���� ������ Ŭ����
	int total;
	Slot slot;

	B_PiggyBank() {
		total = 0;
		slot = new Slot();
	}

	class Slot { // �Ա� Ŭ����
		void put(int amount) {
			total += amount;
		}
	}
}