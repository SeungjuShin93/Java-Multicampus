package Quiz2;

import java.util.Scanner;

public class Sungjuk {
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	Sungjuk(){} // 디폴트 생성자
	
	void input_Sungjuk()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력 => ");
		this.hakbun = scan.next();
		System.out.println("이름 입력 => ");
		this.irum = scan.next();
		System.out.println("국어 입력 => ");
		this.kor = scan.nextInt();
		System.out.println("영어 입력 => ");
		this.eng = scan.nextInt();
		System.out.println("수학 입력 => ");
		this.math = scan.nextInt();
	}
	
	void process_Sungjuk()
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
	
	void output_Sungjuk()
	{
		System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}
}
