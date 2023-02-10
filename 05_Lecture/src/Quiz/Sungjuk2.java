package Quiz;

import java.util.Scanner;

public class Sungjuk2 {
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	// 5�� ���� �ʵ� ��� �Ŀ� �߰�
	static int cnt = 0;
	static double tot_avg = 0;
	
	Sungjuk2(){} // ����Ʈ ������
	
	boolean input()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�й� �Է� => ");
		this.hakbun = scan.next();
		if (hakbun.equals("exit"))
			return true;
		System.out.println("�̸� �Է� => ");
		this.irum = scan.next();
		System.out.println("���� �Է� => ");
		this.kor = scan.nextInt();
		System.out.println("���� �Է� => ");
		this.eng = scan.nextInt();
		System.out.println("���� �Է� => ");
		this.math = scan.nextInt();
		return false;
	}
	
	
	void process()
	{
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot/ 3.;
		
		switch ((int)this.avg / 10) {
		case 10:
		case 9:
			this.grade = "��";
			break;
		case 8:
			this.grade = "��";
			break;
		case 7:
			this.grade = "��";
			break;
		case 6:
			this.grade = "��";
			break;
		default:
			this.grade = "��";
			break;
		}
	}
	
	void output()
	{
		System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
	static double getTotalAvg() {
		return tot_avg / cnt;
	}
}
