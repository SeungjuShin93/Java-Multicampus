package Quiz1;

import java.util.Scanner;

class Sawon {
	String sabun, deptname, irum, gender, email;

	Sawon() {
	}

	void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �Է� => ");
		sabun = scan.next();
		System.out.println("�μ��� �Է� => ");
		deptname = scan.next();
		System.out.println("�̸� �Է� => ");
		irum = scan.next();
		System.out.println("���� �Է� => ");
		gender = scan.next();
		System.out.println("�̸��� �Է� => ");
		email = scan.next();
	}

	public void outputData() {
		System.out.printf("%5s %6s %9s %9s %20s\n", sabun, deptname, irum, gender, email);
	}
}