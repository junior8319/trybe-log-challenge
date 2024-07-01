package log.trybe;

public class Truck extends Vehicle implements Transporter {

  public Truck(String plate, int manufactureYear) {
    super(plate, manufactureYear);
    this.setFuelType("Diesel");
  }

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println(
        "Abastecendo caminhão:\n"
            + " Placa: " + this.getPlate()
            + " Local: " + place
            + " Motorista: " + driver
            + " Valor: " + price
    );
    super.toFuel(place, driver, price);
  }

  @Override
  public void refuellingsList() {
    System.out.println("Lista de abastecimentos de caminhão:");
    super.refuellingsList();
  }

  @Override
  public String toTransport(String origin, String destination) {
    return String.format(
        "Veículo de placa %s, vai transportar carga de %s para %s",
        this.getPlate(),
        origin,
        destination
    );
  }
}
