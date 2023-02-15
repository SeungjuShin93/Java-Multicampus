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
		if (!(obj instanceof Sungjuk)) // ������ obj ��ü�� Ÿ������ ĳ��Ʈ ������ �����ϸ� True
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
		String str = "�й� : " + this.hakbun + "\n";
		str += "�̸� : " + this.irum + "\n";
		str += "���� : " + this.kor + "\n";
		str += "���� : " + this.eng + "\n";
		str += "���� : " + this.math + "\n";
		str += "���� : " + this.tot + "\n";
		str += "��� : " + this.avg + "\n";
		str += "��� : " + this.grade + "\n";
		return str;
	}

	void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("�й� �Է� => ");
		this.hakbun = scan.next();
		System.out.print("�̸� �Է� => ");
		this.irum = scan.next();
		System.out.print("���� �Է� => ");
		this.kor = scan.nextInt();
		System.out.print("���� �Է� => ");
		this.eng = scan.nextInt();
		System.out.print("���� �Է� => ");
		this.math = scan.nextInt();
	}

	void process() {
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / 3.;

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = "��";
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		case 6:
			grade = "��";
			break;
		default:
			grade = "��";
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