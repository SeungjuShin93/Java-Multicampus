

public class B_GoodsStock {
	 String goodsCode; // ��ǰ�ڵ忡 �ش��ϴ� �ʵ�
	 int stockNum;  // �������� �ش��ϴ� �ʵ�
	 
	 B_GoodsStock(){
		 
	 }
	 B_GoodsStock(String goodsCode, int stockNum) { 
		 this.goodsCode = goodsCode; 
		 this.stockNum = stockNum; 
	 } // ��������� ���๮�� ������� ���� �����ڸ� �߰������ �Ѵ�.
	 
	 void addStock(int amount) { // ��� ���Ѵ� ��ɿ� �ش��ϴ� �޼ҵ�
		 this.stockNum += amount; 
	 }
	 int subtractStock(int amount) { // ��� ���� ��ɿ� �ش��ϴ� �޼ҵ�
		 if (this.stockNum < amount)
			 return 0;
		 this.stockNum -= amount; 
		 return amount;
	 }
}
