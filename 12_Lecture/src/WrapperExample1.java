class WrapperExample1 {
	public static void main(String args[]) {
//		Integer obj1 = new Integer(12); // 더이상 지원 하지 않음 
//		Integer obj2 = new Integer(7); // 더이상 지원 하지 않음 
		// 이제는 new 연산자를 이용해서 객체를 만들 필요가 없이 바로 사용 가능
		Integer obj1 = 12;
		Integer obj2 = 7;
		Integer obj3 = Integer.parseInt("7");
		int sum = obj1.intValue() + obj2.intValue() + obj3.intValue();
		System.out.println(sum);
	}
}