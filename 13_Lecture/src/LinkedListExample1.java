import java.util.LinkedList;

class LinkedListExample1 {
   public static void main(String args[]) {
      LinkedList<String> list = new LinkedList<String>();
      list.add("����");
      list.add("����");
      list.add("������");

      // for (int cnt = 0; cnt < list.size(); cnt++) {
      // String str = list.get(cnt);
      // System.out.println(str);
      // }
      for (String str : list) {
         System.out.println(str);
      } // ���� for���� ����ϸ�, ���������� ���������� ���� �����ϰ� ����� ��, �� ȿ������
   }
}
