import java.util.*;

class HashMapExample1 {
	public static void main(String args[]) {
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("�ظ�", 95);
		hashtable.put("�츣�̿´�", 100);
		hashtable.put("��", 85);
		hashtable.put("�巹����", 93);
		hashtable.put("�׺�", 70);
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������? " + num);
	}
}
