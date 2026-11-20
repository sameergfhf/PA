// SortPeople
import java.util.*;

class SortPeople {

  public String[] sortPeople(String[] names, int[] heights) {
    Integer[] idx = new Integer[names.length];
    for (int i = 0; i < idx.length; i++) idx[i] = i;
    Arrays.sort(idx, (i, j) -> Integer.compare(heights[j], heights[i]));
    String[] r = new String[names.length];
    for (int i = 0; i < r.length; i++) r[i] = names[idx[i]];
    return r;
  }
}
