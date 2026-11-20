// PalindromeStringUsingDeque
import java.util.*;

class PalindromeStringUsingDeque {

  public boolean isPalindrome(String s) {
    Deque<Character> d = new ArrayDeque<>();
    for (char c : s.toLowerCase().toCharArray())
      if (Character.isLetterOrDigit(c)) d.add(c);
    while (d.size() > 1)
      if (!d.removeFirst().equals(d.removeLast())) return false;
    return true;
  }
}
