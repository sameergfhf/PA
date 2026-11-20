// ServiceDeskQueueWithCancellations
import java.util.*;

class ServiceDeskQueueWithCancellations {

  Queue<String> q = new ArrayDeque<>();
  Set<String> cancelled = new HashSet<>();

  public void add(String id) {
    q.offer(id);
  }

  public void cancel(String id) {
    cancelled.add(id);
  }

  public String next() {
    while (!q.isEmpty()) {
      String id = q.poll();
      if (!cancelled.remove(id)) return id;
    }
    return null;
  }

  public int activeCount() {
    return q.size() - cancelled.size();
  }
}
