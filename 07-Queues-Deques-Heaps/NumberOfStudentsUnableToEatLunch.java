// NumberOfStudentsUnableToEatLunch
import java.util.*;

class NumberOfStudentsUnableToEatLunch {

  public int countStudents(int[] s, int[] sands) {
    Queue<Integer> q = new ArrayDeque<>();
    for (int x : s) q.add(x);
    int i = 0,
      rot = 0;
    while (!q.isEmpty() && rot < q.size()) {
      if (q.peek() == sands[i]) {
        q.remove();
        i++;
        rot = 0;
      } else {
        q.add(q.remove());
        rot++;
      }
    }
    return q.size();
  }
}
