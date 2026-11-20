// DequeBasedPalindromeChecker
import java.util.*;

class DequeBasedPalindromeChecker {

  public boolean check(String s) {
    Deque<Character> d = new ArrayDeque<>();
    for (char c : s.toLowerCase().toCharArray())
      if (Character.isLetterOrDigit(c)) d.add(c);
    while (d.size() > 1) if (d.removeFirst() != d.removeLast()) return false;
    return true;
  }
}
