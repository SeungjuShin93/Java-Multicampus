package Inheritance2;

public class SenderMain {
	public static void main(String args[]) {
		 EmailSender obj1 = new EmailSender("생일을 축하합니다", "고객센터",
		 "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		 SmsSender obj2 = new SmsSender("생일을 축하합니다", "고객센터",
		 "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
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
