

public class B_GoodsStock {
	 String goodsCode; // 상품코드에 해당하는 필드
	 int stockNum;  // 재고수량에 해당하는 필드
	 
	 B_GoodsStock(){
		 
	 }
	 B_GoodsStock(String goodsCode, int stockNum) { 
		 this.goodsCode = goodsCode; 
		 this.stockNum = stockNum; 
	 } // 명시적으로 실행문을 만들었을 때는 생성자를 추가해줘야 한다.
	 
	 void addStock(int amount) { // 재고를 더한다 기능에 해당하는 메소드
		 this.stockNum += amount; 
	 }
	 int subtractStock(int amount) { // 재고를 뺀다 기능에 해당하는 메소드
		 if (this.stockNum < amount)
			 return 0;
		 this.stockNum -= amount; 
		 return amount;
	 }
}
