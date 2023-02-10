package Quiz;

import java.util.Scanner;

public class Sangpum {
	String code, irum;
	int su, dan, price;
	
	public Sangpum(){}
	
	void input_sangpum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("상품코드 입력 => ");
		this.code = scan.next();
		System.out.println("상품명 입력 => ");
		this.irum = scan.next();
		System.out.println("수량 입력 => ");
		this.su = scan.nextInt();
		System.out.println("단가 입력 => ");
		this.dan = scan.nextInt();
	}
	
	void process_sangpum()
	{
		this.price = this.su * this.dan;
	}
	
	void output_sangpum()
	{
		System.out.printf("%4s %6s  %4d    %7d %8d\n",
				this.code, this.irum, this.su, this.dan, this.price);
	}
}
