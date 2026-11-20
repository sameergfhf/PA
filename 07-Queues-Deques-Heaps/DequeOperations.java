// DequeOperations
import java.util.*;

class DequeOperations {

  public static void main(String[] args) {
    Deque<Integer> d = new ArrayDeque<>();
    d.addFirst(10);
    d.addLast(20);
    System.out.println(d.peekFirst());
    System.out.println(d.peekLast());
    System.out.println(d.removeFirst());
    System.out.println(d.removeLast());
  }
}
