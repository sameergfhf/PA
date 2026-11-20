// MovingAverageFromDataStream
import java.util.*;

class MovingAverageFromDataStream {

  Queue<Integer> q = new ArrayDeque<>();
  int size;
  long sum = 0;

  MovingAverageFromDataStream(int s) {
    size = s;
  }

  public double next(int v) {
    q.add(v);
    sum += v;
    if (q.size() > size) sum -= q.remove();
    return (double) sum / q.size();
  }
}
