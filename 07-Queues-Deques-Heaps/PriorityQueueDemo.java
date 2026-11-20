// PriorityQueueDemo
import java.util.*;

class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    q.add(5);
    q.add(2);
    q.add(9);
    while (!q.isEmpty()) System.out.println(q.poll());
  }
}
