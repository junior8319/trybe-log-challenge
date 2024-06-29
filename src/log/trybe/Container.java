package log.trybe;

public class Container implements Transporter{
  String model;
  double capacity;

  @Override
  public void toTransport() {
    System.out.println("Transportando em conteiner...");
  }
}
