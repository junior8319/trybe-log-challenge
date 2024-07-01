package log.trybe;

public class Container implements Transporter{
  String model;
  double capacity;

  @Override
  public String toTransport(String origin, String destination) {
    return "Transportando";
  }
}
