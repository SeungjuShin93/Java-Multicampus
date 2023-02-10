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
		System.out.println("\n\t    *** ��ǰ���� ***");
		System.out.println("=========================================");
		System.out.println("��ǰ�ڵ�\t��ǰ��\t����\t�ܰ�\t�ݾ�");
		System.out.println("=========================================");
		for (int i=0; i<cnt; i++) {
			obj[i].output();
		}
		System.out.println("=========================================");
	}
}
