
public class I_Accumulator {
	 int total = 0;
	 static int grandTotal = 0; // ���� �ʵ带 �����ϴ� ����
	 
	 void accumulate(int amount) {
		 total += amount;
		 grandTotal += amount; // ���� �ʵ带 ����ϴ� ��ɹ�
	 }
	 
	 static int getGrandTotal() { // ���� �޼ҵ� ����
//		 grandTotal = total; // total�� ��ü�� ���������� ����� �� �ִ� �ʵ�� ������ ���� �߻�
		 return grandTotal; 
	 }
}
