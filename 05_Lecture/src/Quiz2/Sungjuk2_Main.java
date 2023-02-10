package Quiz2;

public class Sungjuk2_Main {
	static int MAX = 100;
	public static void main(String[] args) {
		Sungjuk2 obj[] = new Sungjuk2[MAX];
//		int cnt;
		
		input_Sungjuk2(obj);
		output_Sungjuk2(obj);
	}
		
	static void input_Sungjuk2(Sungjuk2 obj[]) {
//		int cnt = 0; 
		for (int i=0; i<MAX; i++) {
			obj[i] = new Sungjuk2();
			if (obj[i].input())
				break;
			obj[i].process();
			Sungjuk2.cnt++;
			System.out.println();
		}
//		return cnt;
	}
	
	static void output_Sungjuk2(Sungjuk2 obj[]) {
//		double tot_avg = 0.0;
		
		System.out.println("\n\t\t *** 성적표 ***");
		System.out.println("===============================================");
		System.out.println("학번    이름    국어    영어   수학   총점   평균     등급");
		System.out.println("===============================================");
		for (int i=0; i<Sungjuk2.cnt; i++) {
			obj[i].output();
			Sungjuk2.tot_avg += obj[i].avg;
		}
		System.out.println("===============================================");
		System.out.printf("\t학생수 = %d, 전체평균 = %5.2f\n", Sungjuk2.cnt, Sungjuk2.getTotalAvg());	
	}
}
