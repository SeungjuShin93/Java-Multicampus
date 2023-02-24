import java.util.LinkedList;

class LinkedListExample1 {
   public static void main(String args[]) {
      LinkedList<String> list = new LinkedList<String>();
      list.add("포도");
      list.add("딸기");
      list.add("복숭아");

      // for (int cnt = 0; cnt < list.size(); cnt++) {
      // String str = list.get(cnt);
      // System.out.println(str);
      // }
      for (String str : list) {
         System.out.println(str);
      } // 향상된 for문을 사용하면, 내부적으로 순차적으로 접근 가능하게 만들어 줌, 더 효율적임
   }
}
