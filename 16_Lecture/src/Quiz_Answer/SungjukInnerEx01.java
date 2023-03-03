package Quiz_Answer;

// A_Cart 예제 활용
class SungjukInnerEx01 {
	public static void main(String args[]) {
		SungjukInner sungjuk = new SungjukInner();
		sungjuk.addSungjuk();
		System.out.println();
		sungjuk.addSungjuk();
		System.out.println();
		SungjukInner.Sungjuk obj = sungjuk.new Sungjuk();
		obj.input();
		obj.process();
		sungjuk.list.add(obj);
		System.out.println();
		printSungjuk(sungjuk);
	}

	static void printSungjuk(SungjukInner sungjuk) {
		int num = sungjuk.getSungjukNum();
		
		System.out.println("\n\t\t *** 성적표 ***");
		System.out.println("===============================================");
		System.out.println("학번    이름    국어    영어   수학   총점   평균     등급");
		System.out.println("===============================================");
		for (int cnt = 0; cnt < num; cnt++) {
			SungjukInner.Sungjuk obj = sungjuk.getSungjuk(cnt);
			obj.output();
		}
		System.out.println("===============================================");
		System.out.printf("\t학생수 = %d, 전체평균 = %5.2f\n", num, sungjuk.getTotalAvg() / num);	
	}
}