package NestedClass_InnerClass;

class F_EMailSender extends F_MessageSender {
	String sender;
	String receiver;

	F_EMailSender(String sender, String receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}

	void send(String message) {
		System.out.println("보내는 사람:" + sender);
		System.out.println("받는 사람:" + receiver);
		System.out.println("내용:" + message);
		System.out.println();
	}
}
