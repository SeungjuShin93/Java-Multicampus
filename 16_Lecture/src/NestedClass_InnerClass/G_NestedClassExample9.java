package NestedClass_InnerClass;

class G_NestedClassExample9 {
	public static void main(String args[]) {
		F_MessageSender obj = new F_MessageSender() {
			void send(String message) {
				System.out.println("�߽�: ���̴ٽ�");
				System.out.println("����: �� ������");
				System.out.println("�޽���: " + message);
				System.out.println();
			}
		}; // �����ݷ� ; �� �ٿ��� ��, anonymous inner class �̸� ���� �̳� Ŭ������� �θ�
		// 1ȸ�� �������θ� ���, ��ü �̸��� ���� ������ ������ �ȵ�, �̰��� �͸� ���� �̳� Ŭ����
		obj.send("�� ���");
	}
}