package Quiz2;

import java.util.Scanner;

public class Sungjuk {
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	Sungjuk(){} // ����Ʈ ������
	
	void input_Sungjuk()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է� => ");
		this.hakbun = scan.next();
		System.out.println("�̸� �Է� => ");
		this.irum = scan.next();
		System.out.println("���� �Է� => ");
		this.kor = scan.nextInt();
		System.out.println("���� �Է� => ");
		this.eng = scan.nextInt();
		System.out.println("���� �Է� => ");
		this.math = scan.nextInt();
	}
	
	void process_Sungjuk()
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
	
	void output_Sungjuk()
	{
		System.out.printf("%4s   %3s  %3d   %3d   %3d   %3d   %5.2f  %2s\n",
				hakbun, irum, kor, eng, math, tot, avg, grade);
	}
}
