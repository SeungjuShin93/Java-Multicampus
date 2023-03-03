package NestedClass_InnerClass;

class F_EMailSender extends F_MessageSender {
	String sender;
	String receiver;

	F_EMailSender(String sender, String receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	void send(String message) {
		System.out.println("������ ���:" + sender);
		System.out.println("�޴� ���:" + receiver);
		System.out.println("����:" + message);
		System.out.println();
	}
}
