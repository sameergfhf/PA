// HospitalManagementPriorityQueue
import java.util.*;

class HospitalManagementPriorityQueue {

  static class Patient {

    String name;
    int severity;

    Patient(String n, int s) {
      name = n;
      severity = s;
    }
  }

  PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) ->
    Integer.compare(b.severity, a.severity)
  );

  public void admit(String name, int severity) {
    pq.offer(new Patient(name, severity));
  }

  public Patient nextPatient() {
    return pq.poll();
  }
}
