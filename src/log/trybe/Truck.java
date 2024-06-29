package log.trybe;

public class Truck extends Vehicle implements Transporter {

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println("Abastecendo caminhão...");
  }

  @Override
  public void refuellingsList() {
    System.out.println("Registrando na lista de abastecimentos de caminhão...");
  }

  @Override
  public void toTransport() {
    System.out.println("Caminhão transportando carga...");
  }
}
