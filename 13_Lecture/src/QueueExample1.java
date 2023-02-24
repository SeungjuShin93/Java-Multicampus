import java.util.*;

class QueueExample1 {
	public static void main(String args[]) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("≈‰≥¢");
		queue.offer("ªÁΩø");
		queue.offer("»£∂˚¿Ã");
		System.out.println("queue.peek() : " + queue.peek());
		while (!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}
}