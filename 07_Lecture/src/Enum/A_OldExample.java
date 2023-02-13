package Enum;

public class A_OldExample {
	public static void main(String args[]) {
		A_ClothingInfo obj = new A_ClothingInfo("32919", "반팔 티셔츠", "면100%",
		A_ClothingInfo.Season.SUMMER);
		System.out.println("상품코드: " + obj.code);
		System.out.println("상품명: " + obj.name);
		System.out.println("소재: " + obj.material);
		System.out.println("계절구분: " + obj.season);
		}
}
