// SortCharactersByFrequency
import java.util.*;

class SortCharactersByFrequency {

  public String frequencySort(String s) {
    Map<Character, Integer> m = new HashMap<>();
    for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
    List<Character> cs = new ArrayList<>(m.keySet());
    cs.sort((a, b) -> m.get(b) - m.get(a));
    StringBuilder r = new StringBuilder();
    for (char c : cs) for (int i = 0; i < m.get(c); i++) r.append(c);
    return r.toString();
  }
}
