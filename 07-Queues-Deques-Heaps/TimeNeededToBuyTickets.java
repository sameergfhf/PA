// TimeNeededToBuyTickets
class TimeNeededToBuyTickets {

  public int timeRequiredToBuy(int[] t, int k) {
    int time = 0;
    for (int i = 0; i < t.length; i++) time += Math.min(
      t[i],
      i <= k ? t[k] : t[k] - 1
    );
    return time;
  }
}
