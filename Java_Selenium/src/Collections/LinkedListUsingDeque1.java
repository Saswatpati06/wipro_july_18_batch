package Collections;
import java.util.Deque;
import java.util.LinkedList;

public class LinkedListUsingDeque1 {
	 public static void main(String[] args) {
	        Deque<String> dq = new LinkedList<>();
	        dq.add("x");
	        dq.add("y");
	        dq.add("z");
	        System.out.println(dq);
	        System.out.println(dq.peekFirst());
	        System.out.println(dq.peekLast());
	        System.out.println(dq.removeFirst());
	        System.out.println(dq.removeLast());
	        System.out.println(dq);
	        dq.addFirst("a");
	        dq.addLast("b");
	        System.out.println(dq);
	        System.out.println(dq.pollFirst());
	        System.out.println(dq.pollLast());
	        System.out.println("Final Deque: " + dq);
	    }
	}


