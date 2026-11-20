// QueueUsingTwoStacks
import java.util.*;

class QueueUsingTwoStacks {

  Deque<Integer> a = new ArrayDeque<>(),
    b = new ArrayDeque<>();

  public void offer(int x) {
    a.push(x);
  }

  private void prep() {
    if (b.isEmpty()) while (!a.isEmpty()) b.push(a.pop());
  }

  public int poll() {
    prep();
    return b.isEmpty() ? -1 : b.pop();
  }

  public int peek() {
    prep();
    return b.isEmpty() ? -1 : b.peek();
  }

  public boolean empty() {
    return a.isEmpty() && b.isEmpty();
  }
}
