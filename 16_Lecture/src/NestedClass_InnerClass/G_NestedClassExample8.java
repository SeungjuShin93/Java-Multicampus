package NestedClass_InnerClass;

class G_NestedClassExample8 {
	public static void main(String args[]) {
		class SatelliteSender extends F_MessageSender {
			void send(String message) {
				System.out.println("�߽�: ���̴ٽ�");
				System.out.println("����: �� ������");
				System.out.println("�޽���: " + message);
				System.out.println();
			}
		}
		SatelliteSender obj = new SatelliteSender();
		obj.send("�� ���");
	}
}