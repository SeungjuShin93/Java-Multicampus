class GoodsStock {
	String goodsCode; // ��ǰ�ڵ�
	int stockNum; // ������

	GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	public String toString() { 	// override
		String str = "��ǰ�ڵ�:" + goodsCode + " ������:" + stockNum;
		return str;
	}
}