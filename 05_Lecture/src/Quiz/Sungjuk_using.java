package Quiz;

public class Sungjuk_using {

	public static void main(String[] args) {
		Sungjuk obj = new Sungjuk();
		obj.input_Sungjuk();
		obj.process_Sungjuk();

	// ����ǥ�� ==== �� ������ output�� ���� ���� ������, �����Ͱ� ���� �� �ϰ�� ���
	System.out.println("\n\t\t *** ����ǥ ***");
	System.out.println("================================================");
	System.out.println("�й�    �̸�    ����    ����   ����   ����   ���     ���");
	obj.output_Sungjuk();
	System.out.println("================================================");
	}
}
