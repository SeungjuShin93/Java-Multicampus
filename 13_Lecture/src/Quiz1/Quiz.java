package Quiz1;


/*
 * 문제 : 사원 정보를 입력받아 사원 정보를 관리하는 프로그램이다.
 * 주어진 메뉴 기능을 완성하시오.
 * 
 * 클래스명 : Sawon
 * 필드명 : 
 * 사원번호 : sabun
 * 부서명 : deptname
 * 이름 : irum
 * 성별 : gender
 * 이메일 : eamil
 * 
 * 메서드 : 
 * inputData() : 사원정보 입력
 * outputData() : 사원정보 출력 
 * 
 * <화면>
 * *** 사원관리 ***
 * 1.사원정보 입력
 * 2.사원정보 출력
 * 3.사원정보 조회
 * 4.사원정보 수정
 * 5.사원정보 삭제
 * 6.프로그램 종료
 * 
 * 메뉴 선택 =>
 * 
 * <입력>
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		ArrayList<Sawon> list = new ArrayList<Sawon>();
		int menu;

		Scanner scan = new Scanner(System.in);
		while (true) {
			printMenu();
			System.out.printf("\n메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.printf("The End...");
				break;
			}

			switch (menu) {
			case 1:
				input_sawon(list);
				break;
			case 2:
				output_sawon(list);
				break;
			case 3:
				search_sawon(list);
				break;
			case 4:
				update_sawon(list);
				break;
			case 5:
				delete_sawon(list);
				break;
			default:

			}
		}
	}

	static void printMenu() {
		System.out.printf("\n*** 사원관리 ***\n");
		System.out.printf("1. 사원정보 입력\n");
		System.out.printf("2. 사원정보 출력\n");
		System.out.printf("3. 사원정보 조회\n");
		System.out.printf("4. 사원정보 수정\n");
		System.out.printf("5. 사원정보 삭제\n");
		System.out.printf("6. 프로그램 종료\n");
	}

	static void input_sawon(ArrayList<Sawon> list) {
		Sawon obj = new Sawon();
		obj.inputData();
		for (Sawon dat : list) {
			if (obj.irum.equals(dat.irum)) {
				System.out.println("\n사원번호 입력 오류(중복)!!\n");
				return;
			}
		}
		list.add(obj);
		System.out.println("\n사원정보 입력 성공!!\n");
	}

	static void output_sawon(ArrayList<Sawon> list) {
		if (list.size() == 0) {
			System.out.println("출력할 사원정보가 없습니다!!\n");
			return;
		}

		System.out.println("\t     *** 사원정보 ***");
		System.out.println("=====================================");
		System.out.println("사원번호       부서명       이름      성별    이메일");
		System.out.println("=====================================");

		for (Sawon dat : list) {
			dat.outputData();
		}
		System.out.println("=====================================");
		System.out.printf("\t\t 총사원수 : %d\n\n", list.size());
	}
	
	static void search_sawon(ArrayList<Sawon> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 사원번호 입력 => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				System.out.println("\n사원번호       부서명       이름      성별    이메일");
				System.out.println("=====================================");
				dat.outputData();
				System.out.println("=====================================");
				return;
			}
		}
		System.out.println("\n조회할 사원번호 입력 오류!!!\n");
	}
	
	static void update_sawon(ArrayList<Sawon> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 사원번호 입력 => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				System.out.println("부서명 입력 => ");
				dat.deptname = scan.next();
				System.out.println("이름 입력 => ");
				dat.irum = scan.next();
				System.out.println("성별 입력 => ");
				dat.gender = scan.next();
				System.out.println("이메일 입력 => ");
				dat.email = scan.next();
				System.out.println("\n사원정보 수정 성공!!!\n");
				return;
			}
		}
		System.out.println("\n수정할 이름 입력 오류!!!\n");
	}
	
	static void delete_sawon(ArrayList<Sawon> list)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 사원번호 입력 => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				list.remove(dat);
				System.out.println("\n사원정보 삭제 성공!!!\n");
				return;
			}
		}
		System.out.println("\n삭제할 사원번호 입력 오류!!!\n");
	}
}
