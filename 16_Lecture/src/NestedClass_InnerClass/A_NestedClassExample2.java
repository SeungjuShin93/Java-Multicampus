package NestedClass_InnerClass;
class A_NestedClassExample2 {
	public static void main(String args[]) {
		A_Cart cart = new A_Cart();
		cart.addItem("ÃİÄİ·¿", 3, 1000);
		cart.addItem("ÄÉÀÌÅ©", 1, 25000);
		cart.addItem("¼¤ÆäÀÎ", 1, 7000);
		A_Cart.Item item = cart.new Item("²É´Ù¹ß", 1, 50000);
		cart.list.add(item);
		printCart(cart);
	}

	static void printCart(A_Cart cart) {
		int num = cart.getItemNum();
		System.out.println(" »óÇ°¸í ¼ö·® ´Ü°¡ ±İ¾×");
		System.out.println("----------------------------------");
		for (int cnt = 0; cnt < num; cnt++) {
			A_Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n", cnt + 1, item.name, item.num, item.unitPrice, item.getPrice());
		}
		System.out.println("----------------------------------");
		System.out.printf(" ÃÑ°è %10d %n", cart.getTotalPrice());
	}
}