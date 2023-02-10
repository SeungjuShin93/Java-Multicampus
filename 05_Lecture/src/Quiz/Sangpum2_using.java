package Quiz;

public class Sangpum2_using {
	static int MAX = 100;
	public static void main(String[] args) {
		Sangpum2 obj[] = new Sangpum2[MAX];
		int cnt;
			
		cnt = input_Sangpum2(obj);
		output_Sangpum2(obj, cnt);
	}	

	static int input_Sangpum2(Sangpum2 obj[]) {
		int cnt = 0;
		for (int i=0; i<MAX; i++) {
			obj[i] = new Sangpum2();
			if (obj[i].input())
				break;
			obj[i].process();
			cnt++;
			System.out.println();
		}
		return cnt;
	}
		
	static void output_Sangpum2(Sangpum2[] obj, int cnt) {
		System.out.println("\n\t    *** 상품정보 ***");
		System.out.println("=========================================");
		System.out.println("상품코드\t상품명\t수량\t단가\t금액");
		System.out.println("=========================================");
		for (int i=0; i<cnt; i++) {
			obj[i].output();
		}
		System.out.println("=========================================");
	}
}
