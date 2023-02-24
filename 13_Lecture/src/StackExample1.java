import java.util.*;

class StackExample1 {
	public static void main(String args[]) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12); // addLast´Â push() °³³ä
		stack.addLast(59);
		stack.addLast(7);
		System.out.println("stack.getLast() : " + stack.getLast()); // getLast´Â peek() °³³ä
		while (!stack.isEmpty()) {
			Integer num = stack.removeLast(); // removeLast´Â pop() °³³ä
			System.out.println(num);
		}
	}
}