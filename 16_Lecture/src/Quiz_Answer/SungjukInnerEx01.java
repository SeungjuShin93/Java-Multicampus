package Quiz_Answer;

// A_Cart ���� Ȱ��
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
		
		System.out.println("\n\t\t *** ����ǥ ***");
		System.out.println("===============================================");
		System.out.println("�й�    �̸�    ����    ����   ����   ����   ���     ���");
		System.out.println("===============================================");
		for (int cnt = 0; cnt < num; cnt++) {
			SungjukInner.Sungjuk obj = sungjuk.getSungjuk(cnt);
			obj.output();
		}
		System.out.println("===============================================");
		System.out.printf("\t�л��� = %d, ��ü��� = %5.2f\n", num, sungjuk.getTotalAvg() / num);	
	}
}