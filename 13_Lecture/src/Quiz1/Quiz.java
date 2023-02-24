package Quiz1;


/*
 * ���� : ��� ������ �Է¹޾� ��� ������ �����ϴ� ���α׷��̴�.
 * �־��� �޴� ����� �ϼ��Ͻÿ�.
 * 
 * Ŭ������ : Sawon
 * �ʵ�� : 
 * �����ȣ : sabun
 * �μ��� : deptname
 * �̸� : irum
 * ���� : gender
 * �̸��� : eamil
 * 
 * �޼��� : 
 * inputData() : ������� �Է�
 * outputData() : ������� ��� 
 * 
 * <ȭ��>
 * *** ������� ***
 * 1.������� �Է�
 * 2.������� ���
 * 3.������� ��ȸ
 * 4.������� ����
 * 5.������� ����
 * 6.���α׷� ����
 * 
 * �޴� ���� =>
 * 
 * <�Է�>
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
			System.out.printf("\n�޴� ���� => ");
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
		System.out.printf("\n*** ������� ***\n");
		System.out.printf("1. ������� �Է�\n");
		System.out.printf("2. ������� ���\n");
		System.out.printf("3. ������� ��ȸ\n");
		System.out.printf("4. ������� ����\n");
		System.out.printf("5. ������� ����\n");
		System.out.printf("6. ���α׷� ����\n");
	}

	static void input_sawon(ArrayList<Sawon> list) {
		Sawon obj = new Sawon();
		obj.inputData();
		for (Sawon dat : list) {
			if (obj.irum.equals(dat.irum)) {
				System.out.println("\n�����ȣ �Է� ����(�ߺ�)!!\n");
				return;
			}
		}
		list.add(obj);
		System.out.println("\n������� �Է� ����!!\n");
	}

	static void output_sawon(ArrayList<Sawon> list) {
		if (list.size() == 0) {
			System.out.println("����� ��������� �����ϴ�!!\n");
			return;
		}

		System.out.println("\t     *** ������� ***");
		System.out.println("=====================================");
		System.out.println("�����ȣ       �μ���       �̸�      ����    �̸���");
		System.out.println("=====================================");

		for (Sawon dat : list) {
			dat.outputData();
		}
		System.out.println("=====================================");
		System.out.printf("\t\t �ѻ���� : %d\n\n", list.size());
	}
	
	static void search_sawon(ArrayList<Sawon> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȸ�� �����ȣ �Է� => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				System.out.println("\n�����ȣ       �μ���       �̸�      ����    �̸���");
				System.out.println("=====================================");
				dat.outputData();
				System.out.println("=====================================");
				return;
			}
		}
		System.out.println("\n��ȸ�� �����ȣ �Է� ����!!!\n");
	}
	
	static void update_sawon(ArrayList<Sawon> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �����ȣ �Է� => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				System.out.println("�μ��� �Է� => ");
				dat.deptname = scan.next();
				System.out.println("�̸� �Է� => ");
				dat.irum = scan.next();
				System.out.println("���� �Է� => ");
				dat.gender = scan.next();
				System.out.println("�̸��� �Է� => ");
				dat.email = scan.next();
				System.out.println("\n������� ���� ����!!!\n");
				return;
			}
		}
		System.out.println("\n������ �̸� �Է� ����!!!\n");
	}
	
	static void delete_sawon(ArrayList<Sawon> list)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �����ȣ �Է� => ");
		String sabun = scan.next();
		
		for (Sawon dat : list) {
			if (sabun.equals(dat.sabun)) {
				list.remove(dat);
				System.out.println("\n������� ���� ����!!!\n");
				return;
			}
		}
		System.out.println("\n������ �����ȣ �Է� ����!!!\n");
	}
}
