import java.util.*;

class HashMapExample2 {
	public static void main(String args[]) {
		HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
		hashtable.put(new Name("�ظ�", "����"), 95);
		hashtable.put(new Name("�츣�̿´�", "�׷�����"), 100);
		hashtable.put(new Name("��", "����"), 85);
		hashtable.put(new Name("�巹����", "������"), 93);
		hashtable.put(new Name("�׺�", "�չ���"), 70);
		Integer num = hashtable.get(new Name("�츣�̿´�", "�׷�����"));
		System.out.println("�츣�̿´� �׷������� ������? " + num);
	}
}