package log.trybe;

public class Motorcycle extends Vehicle{
  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println("Abastecendo motocicleta...");
  }

  @Override
  public void refuellingsList() {
    System.out.println("Registrando na lista de abastecimento de motocicleta...");
  }
}
