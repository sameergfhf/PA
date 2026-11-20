// ImplementStackUsingQueues
import java.util.*;

class ImplementStackUsingQueues {

  Queue<Integer> q = new ArrayDeque<>();

  public void push(int x) {
    q.add(x);
    for (int i = 0; i < q.size() - 1; i++) q.add(q.remove());
  }

  public int pop() {
    return q.remove();
  }

  public int top() {
    return q.element();
  }

  public boolean empty() {
    return q.isEmpty();
  }
}
