package log.trybe;

public class Motorcycle extends Vehicle implements Transporter {

  @Override
  public void toTransport() {
    System.out.println("Motocicleta transportando carga...");
  }

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println("Abastecendo motocicleta...");
  }

  @Override
  public void refuellingsList() {
    System.out.println("Registrando na lista de abastecimento de motocicleta...");
  }
}
