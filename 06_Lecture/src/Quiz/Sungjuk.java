package Quiz;

import java.util.Scanner;

public class Sungjuk extends Person implements Personable {
	int kor, eng, math, tot;
	double avg;
	String grade;

	Sungjuk() {
		//super();
	}
	
	@Override
	public boolean input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력 => ");
		this.hakbun = scan.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		
		System.out.println("이름 입력 => ");
		this.irum = scan.next();
		System.out.println("국어 입력 => ");
		this.kor = scan.nextInt();
		System.out.println("영어 입력 => ");
		this.eng = scan.nextInt();
		System.out.println("수학 입력 => ");
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
			this.grade = "수";
			break;
		case 8:
			this.grade = "우";
			break;
		case 7:
			this.grade = "미";
			break;
		case 6:
			this.grade = "양";
			break;
		default:
			this.grade = "가";
			break;
		}
	}
	
	@Override
	public void output() {
		System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}	
}
