
public class F_Numbers2 {
	int num[];
	
	F_Numbers2(int num[]) { // ������
		this.num = num;
	}
	
	int getTotal() { // �迭�� �հ踦 ���ϴ� �޼ҵ�
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
			total += num[cnt];
		return total;
	}
	
	int getAverage() { // ����� ���ϴ� �޼ҵ�
		int total;
		total = getTotal(); // ���� ���� �޼ҵ带 ��Ȱ��
		int average = total / num.length; 
		return average;
	}
}
