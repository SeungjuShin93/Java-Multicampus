package Quiz;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable{

	String phone;
	String addr;
	
	PersonInfo()
	{
		// super();
	}

	@Override
	public boolean input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է� => ");
		this.hakbun = scan.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		
		System.out.println("�̸� �Է� => ");
		this.irum = scan.next();
		System.out.println("��ȭ��ȣ �Է� => ");
		this.phone = scan.next();
		System.out.println("�ּ� �Է� => ");
		this.addr = scan.next();
		return false;
	}

	@Override
	public void output() {
		System.out.printf("%4s   %3s  %11s   %2s\n",
				hakbun, irum, phone, addr);
	}

}
