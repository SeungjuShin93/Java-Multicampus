package Interface;
// �������̽��� �߻�޼��常 ��� ����
public interface Lendable {
	 void checkOut(String borrower, String date) throws Exception;
	 public abstract void checkIn(); // public abstract �����ص� ������ �� �ڵ� ����
}
