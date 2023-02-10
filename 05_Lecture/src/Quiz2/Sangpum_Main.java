package Quiz2;

public class Sangpum_Main {

	public static void main(String[] args) {
		Sangpum obj = new Sangpum();
		obj.input_sangpum();
		obj.process_sangpum();
		
		System.out.println("\n\t*** 상품정보 ***");
		System.out.println("=========================================");
		System.out.println("상품코드\t상품명\t수량\t단가\t금액");
		System.out.println("=========================================");
		obj.output_sangpum();
		System.out.println("=========================================");
	}

}