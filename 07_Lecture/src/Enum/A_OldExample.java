package Enum;

public class A_OldExample {
	public static void main(String args[]) {
		A_ClothingInfo obj = new A_ClothingInfo("32919", "���� Ƽ����", "��100%",
		A_ClothingInfo.Season.SUMMER);
		System.out.println("��ǰ�ڵ�: " + obj.code);
		System.out.println("��ǰ��: " + obj.name);
		System.out.println("����: " + obj.material);
		System.out.println("��������: " + obj.season);
		}
}
