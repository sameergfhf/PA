// Dota2Senate
import java.util.*;

class Dota2Senate {

  public String predictPartyVictory(String s) {
    Queue<Integer> r = new ArrayDeque<>(),
      d = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) (s.charAt(i) == 'R' ? r : d).add(i);
    while (!r.isEmpty() && !d.isEmpty()) {
      int x = r.poll(),
        y = d.poll();
      if (x < y) r.add(x + s.length());
      else d.add(y + s.length());
    }
    return r.isEmpty() ? "Dire" : "Radiant";
  }
}
