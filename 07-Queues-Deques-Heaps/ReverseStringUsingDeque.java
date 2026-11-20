// ReverseStringUsingDeque
import java.util.*;

class ReverseStringUsingDeque {

  public String reverse(String s) {
    Deque<Character> d = new ArrayDeque<>();
    for (char c : s.toCharArray()) d.push(c);
    StringBuilder b = new StringBuilder();
    while (!d.isEmpty()) b.append(d.pop());
    return b.toString();
  }
}
