// PriorityBasedLabAccess
import java.util.*;

class PriorityBasedLabAccess {

  static class Person {

    String id;
    int priority;

    Person(String i, int p) {
      id = i;
      priority = p;
    }
  }

  PriorityQueue<Person> q = new PriorityQueue<>((a, b) ->
    Integer.compare(b.priority, a.priority)
  );

  public void enqueue(String id, int priority) {
    q.add(new Person(id, priority));
  }

  public Person grantAccess() {
    return q.poll();
  }
}
