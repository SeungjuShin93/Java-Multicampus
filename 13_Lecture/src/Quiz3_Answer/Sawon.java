package Quiz3_Answer;

import java.util.Scanner;

class Sawon {
//	CREATE TABLE sawon (
//		sabun	 CHAR(4) NOT NULL PRIMARY KEY,
//		deptname VARCHAR(15) NOT NULL,
//		irum VARCHAR(10) NOT NULL,
//		gender CHAR(2) NULL,
//		email VARCHAR(50) NOT NULL
//	);
	String sabun, deptname, irum, gender, email;

	Sawon() {
	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("사원정보 입력 => ");
		sabun = scan.next();
		System.out.println("부서명 입력 => ");
		deptname = scan.next();
		System.out.println("이름 입력 => ");
		irum = scan.next();
		System.out.println("성별 입력 => ");
		gender = scan.next();
		System.out.println("이메일 입력 => ");
		email = scan.next();
	}

	public void outputData() {
		System.out.printf("%5s %6s %9s %9s %20s\n", sabun, deptname, irum, gender, email);
	}
}