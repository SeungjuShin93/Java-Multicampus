

public class B_ClassExample1 {
	public static void main(String args[]) {
		 B_GoodsStock obj;
		 obj = new B_GoodsStock("52135", 200);
//		 obj.goodsCode = "52135";
//		 obj.stockNum = 200;
		 System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		 System.out.println("������:" + obj.stockNum);
		 obj.addStock(1000);
		 System.out.println("��ǰ�ڵ�:" + obj.goodsCode);
		 System.out.println("������:" + obj.stockNum);
		 }
}
