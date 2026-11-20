// ImplementQueueUsingStacks
import java.util.*;

class ImplementQueueUsingStacks {

  Deque<Integer> in = new ArrayDeque<>(),
    out = new ArrayDeque<>();

  public void push(int x) {
    in.push(x);
  }

  private void move() {
    if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
  }

  public int pop() {
    move();
    return out.pop();
  }

  public int peek() {
    move();
    return out.peek();
  }

  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }
}
