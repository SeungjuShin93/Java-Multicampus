package Inheritance2;

public class SenderMain {
	public static void main(String args[]) {
		 EmailSender obj1 = new EmailSender("������ �����մϴ�", "������",
		 "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		 SmsSender obj2 = new SmsSender("������ �����մϴ�", "������",
		 "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");
//		 obj1.sendMessage("hatman@yeyeye.com");
//		 obj1.sendMessage("stickman@hahaha.com");
//		 obj2.sendMessage("010-000-0000");
		 send(obj1, "hatman@yeyeye.com");
		 send(obj1, "stickman@hahaha.com");
		 send(obj2, "010-000-0000");
	}
	
	static void send(MessageSender obj, String recipient) {
		obj.sendMessage(recipient);
	}
}
