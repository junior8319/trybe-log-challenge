package log.trybe;

public class Car extends Vehicle{

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println("Abastecendo carro...");
  }

  @Override
  public void refuellingsList() {
    System.out.println("Registrando na lista de abastecimentos do carro...");
  }
}
