package Quiz2;
/* 
 * HashMap�� ����Ͽ� �Ʒ� ����� ���� �Ͻÿ�.
 * Ű : �����ȣ, �� : �����ü
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
import java.util.HashMap;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		HashMap<String, Sawon> hashmap = new HashMap<String, Sawon>();
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("�޴� ���� => ");
			menu = scan.nextInt();
			System.out.println();
			
			if (menu == 6) {
				System.out.println("The End...");
				break;
			}
			
			switch (menu)
			{
				case 1:
					input_sawon(hashmap);
					break;
				case 2:
					output_sawon(hashmap);
					break;
				case 3:
					search_sawon(hashmap);
					break;
				case 4:
					update_sawon(hashmap);
					break;
				case 5:
					delete_sawon(hashmap);
					break;
				default: 
				
			}
		}	
	}
	
	static void printMenu()
	{
		System.out.println("*** ������� ***");
		System.out.println("1. ������� �Է�");
		System.out.println("2. ������� ���");
		System.out.println("3. ������� ��ȸ");
		System.out.println("4. ������� ����");
		System.out.println("5. ������� ����");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}
	
	static void input_sawon(HashMap<String, Sawon> hashmap)
	{
		Sawon obj = new Sawon();
		obj.inputData();
		
		//if (hashmap.get(obj.sabun) != null) {
		if (hashmap.containsKey(obj.sabun)) {
			System.out.println("\n�����ȣ �Է� ����(�ߺ�)!!\n");
			return;
		}

		hashmap.put(obj.sabun, obj);
		System.out.println("\n������� �Է� ����!!\n");
	}
	
	static void output_sawon(HashMap<String, Sawon> hashmap)
	{
		// 1. keySet() �̿�
//		Set<String> keyset = hashmap.keySet(); // hashmap�� �����ϴ� Ű ������ ����
//		
//		if (keyset.size() == 0)  //if (hashmap.isEmpty())
//		{
//			System.out.println("����� ��������� �����ϴ�!!\n");
//			return;
//		}
//		
//		System.out.println("\t      *** ������� ***");
//		System.out.println("===========================================================");
//		System.out.println("�����ȣ    �μ���       �̸�         ����               �̸���");
//		System.out.println("===========================================================");
//		for (String sabun : keyset)
//		{
//			Sawon obj = hashmap.get(sabun);
//			obj.outputData();
//		}
//		System.out.println("===========================================================");
//		System.out.printf("\t\t �ѻ���� : %d\n\n", hashmap.size());
		
		// 2. 
//		Set entryset = hashmap.entrySet(); // hashmap�� �����ϴ� Ű�� ���� ������ ����
//		
//		if (entryset.size() == 0)  //if (hashmap.isEmpty())
//		{
//			System.out.println("����� ��������� �����ϴ�!!\n");
//			return;
//		}
//		
//		System.out.println("\t      *** ������� ***");
//		System.out.println("===========================================================");
//		System.out.println("�����ȣ    �μ���       �̸�         ����               �̸���");
//		System.out.println("===========================================================");
//		Iterator it_entry = entryset.iterator(); // �������� ������ ���� Iterator ��ü�� ��ȯ
//		while(it_entry.hasNext())
//		{
//			// Ű�� ���� �б� ���� Map.Entry�� ĳ��Ʈ ����
//			Map.Entry e = (Map.Entry) it_entry.next();
//			// e.getValue():������ ���� �о� ��, e.getKey():Ű ���� �о��
//			// e.getValue()�� ���� Ÿ���� Object�̹Ƿ� Sawon���� ĳ��Ʈ ����
//			Sawon obj = (Sawon)e.getValue(); 
//			obj.outputData();
//		}
//		System.out.println("===========================================================");
//		System.out.printf("\t\t �ѻ���� : %d\n\n", hashmap.size());
		
        // 3. 		
		if (hashmap.size() == 0)
		{
			System.out.println("����� ��������� �����ϴ�!!\n");
			return;
		}
		
        System.out.println("\t      *** ������� ***");
		System.out.println("===========================================================");
		System.out.println("�����ȣ    �μ���       �̸�         ����               �̸���");
		System.out.println("===========================================================");
		for (Sawon obj : hashmap.values()) {
			obj.outputData();
		}
		System.out.println("===========================================================");
		System.out.printf("\t\t �ѻ���� : %d\n\n", hashmap.size());
	}
	
	static void search_sawon(HashMap<String, Sawon> hashmap)
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("��ȸ�� �����ȣ �Է� => ");
		String sabun = scan.next();
		
		Sawon obj = hashmap.get(sabun);
		if (obj != null) {
			System.out.println("�����ȣ    �μ���       �̸�         ����               �̸���");
			System.out.println("===========================================================");
			obj.outputData();
			System.out.println("===========================================================\n");
			return;	
		}
		System.out.println("\n��ȸ�� �����ȣ �Է� ����!!\n");
	}
	
	static void update_sawon(HashMap<String, Sawon> hashmap)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �����ȣ �Է� => ");
		String sabun = scan.next();
		
		Sawon obj = hashmap.get(sabun);
		if (obj != null) {
			System.out.print("�μ��� �Է� => ");
			obj.deptname = scan.next();
			System.out.print("�̸� �Է� => ");
			obj.irum = scan.next();
			System.out.print("���� �Է� => ");
			obj.gender = scan.next();
			System.out.print("�̸��� �Է� => ");
			obj.email = scan.next();
			System.out.println("\n������� ���� ����!!\n");
			return;
		}
		System.out.println("\n������ �̸� �Է� ����!!\n");
	}
	
	static void delete_sawon(HashMap<String, Sawon> hashmap)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �����ȣ �Է� => ");
		String sabun = scan.next();
		
		Sawon obj = hashmap.get(sabun);
		if (obj != null) {
			hashmap.remove(sabun);
			System.out.println("\n������� ���� ����!!\n");
			return;
		}
		System.out.println("\n������ �����ȣ �Է� ����!!\n");
	}
}