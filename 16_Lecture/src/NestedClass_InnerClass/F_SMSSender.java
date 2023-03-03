package NestedClass_InnerClass;

class F_SMSSender extends F_MessageSender {
	String phoneNo;
	String responsePhoneNo;

	F_SMSSender(String phoneNo, String responsePhoneNo) {
		this.phoneNo = phoneNo;
		this.responsePhoneNo = responsePhoneNo;
	}

	void send(String message) {
		System.out.println("��ȭ��ȣ:" + phoneNo);
		System.out.println("����:" + message);
		System.out.println("ȸ����ȭ��ȣ:" + responsePhoneNo);
		System.out.println();
	}
}
