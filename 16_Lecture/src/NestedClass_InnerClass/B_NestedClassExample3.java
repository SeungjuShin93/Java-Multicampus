package NestedClass_InnerClass;
class B_NestedClassExample3 {
	public static void main(String args[]) {
		B_PiggyBank bank1 = new B_PiggyBank();
		B_PiggyBank bank2 = new B_PiggyBank();
		B_PiggyBank bank3 = new B_PiggyBank();
		bank2.slot.put(100);
		System.out.println("ù��° ���� ������: " + bank1.total);
		System.out.println("�ι�° ���� ������: " + bank2.total);
		System.out.println("����° ���� ������: " + bank3.total);
	}
}
