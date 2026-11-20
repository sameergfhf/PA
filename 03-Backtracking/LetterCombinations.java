// LetterCombinations
import java.util.*;

class LetterCombinations {

  private final String[] map = {
    "",
    "",
    "abc",
    "def",
    "ghi",
    "jkl",
    "mno",
    "pqrs",
    "tuv",
    "wxyz",
  };

  public List<String> letterCombinations(String digits) {
    List<String> r = new ArrayList<>();
    if (digits.isEmpty()) return r;
    go(digits, 0, new StringBuilder(), r);
    return r;
  }

  private void go(String s, int i, StringBuilder b, List<String> r) {
    if (i == s.length()) {
      r.add(b.toString());
      return;
    }
    for (char c : map[s.charAt(i) - '0'].toCharArray()) {
      b.append(c);
      go(s, i + 1, b, r);
      b.deleteCharAt(b.length() - 1);
    }
  }
}
