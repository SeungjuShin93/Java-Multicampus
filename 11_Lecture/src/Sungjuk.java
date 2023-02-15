import java.util.Scanner;

public class Sungjuk implements Cloneable{
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;

	static int cnt = 0;
	static double tot_avg = 0.0;

	Sungjuk() {
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Sungjuk)) // 들어오면 obj 객체를 타입으로 캐스트 연산이 가능하면 True
			return false;
		Sungjuk Sungjuk = (Sungjuk) obj;
		if (this.hakbun.equals(Sungjuk.hakbun) &&
				this.irum.equals(Sungjuk.irum) &&
				this.kor == Sungjuk.kor	&&
				this.eng == Sungjuk.eng &&
				this.math == Sungjuk.math)
			return true;
		else
return false;
	}

	public String toString() { // override
		String str = "학번 : " + this.hakbun + "\n";
		str += "이름 : " + this.irum + "\n";
		str += "국어 : " + this.kor + "\n";
		str += "영어 : " + this.eng + "\n";
		str += "수학 : " + this.math + "\n";
		str += "총점 : " + this.tot + "\n";
		str += "평균 : " + this.avg + "\n";
		str += "등급 : " + this.grade + "\n";
		return str;
	}

	void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("학번 입력 => ");
		this.hakbun = scan.next();
		System.out.print("이름 입력 => ");
		this.irum = scan.next();
		System.out.print("국어 입력 => ");
		this.kor = scan.nextInt();
		System.out.print("영어 입력 => ");
		this.eng = scan.nextInt();
		System.out.print("수학 입력 => ");
		this.math = scan.nextInt();
	}

	void process() {
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3.;

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;
		}
	}

	void output() {
		System.out.printf("%4s  %3s  %3d   %3d   %3d   %3d  %5.2f  %2s\n", hakbun, irum, kor, eng, math, tot, avg,
				grade);
	}

	static double getTotal_avg() {
		return tot_avg / cnt;
	}
}