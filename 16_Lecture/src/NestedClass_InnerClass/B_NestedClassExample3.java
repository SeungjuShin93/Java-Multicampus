package NestedClass_InnerClass;
class B_NestedClassExample3 {
	public static void main(String args[]) {
		B_PiggyBank bank1 = new B_PiggyBank();
		B_PiggyBank bank2 = new B_PiggyBank();
		B_PiggyBank bank3 = new B_PiggyBank();
		bank2.slot.put(100);
		System.out.println("첫번째 돼지 저금통: " + bank1.total);
		System.out.println("두번째 돼지 저금통: " + bank2.total);
		System.out.println("세번째 돼지 저금통: " + bank3.total);
	}
}
