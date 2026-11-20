// RunningAverage
class RunningAverage {

  private long sum;
  private int count;

  public double add(int x) {
    sum += x;
    count++;
    return (double) sum / count;
  }

  public double average() {
    if (count == 0) throw new IllegalStateException();
    return (double) sum / count;
  }
}
