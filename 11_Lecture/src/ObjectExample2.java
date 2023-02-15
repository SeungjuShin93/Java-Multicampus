class ObjectExample2 {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("57293", 100);
//		String str = obj.toString();
//		System.out.println(str);
		System.out.println(obj); // obj뒤에 .toString()이 생략 되어 있음
		System.out.println(obj.toString() + " => 테스트".toString()); 
	}
}
