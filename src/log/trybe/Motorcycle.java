package log.trybe;

public class Motorcycle extends Vehicle{

  public Motorcycle(String plate, int manufactureYear) {
    super(plate, manufactureYear);
  }

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println(
        "Abastecendo motocicleta:\n"
            + " Placa: " + this.getPlate()
            + " Local: " + place
            + " Motorista: " + driver
            + " Valor: " + price
    );
    super.toFuel(place, driver, price);
  }

  @Override
  public void refuellingsList() {
    System.out.println("Lista de abastecimentos de motocicleta:\n");
    super.refuellingsList();
  }
}
