class WrapperExample1 {
	public static void main(String args[]) {
//		Integer obj1 = new Integer(12); // ���̻� ���� ���� ���� 
//		Integer obj2 = new Integer(7); // ���̻� ���� ���� ���� 
		// ������ new �����ڸ� �̿��ؼ� ��ü�� ���� �ʿ䰡 ���� �ٷ� ��� ����
		Integer obj1 = 12;
		Integer obj2 = 7;
		Integer obj3 = Integer.parseInt("7");
		int sum = obj1.intValue() + obj2.intValue() + obj3.intValue();
		System.out.println(sum);
	}
}