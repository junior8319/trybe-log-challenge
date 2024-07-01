package log.trybe;

public class Car extends Vehicle{

  public Car(String plate, int manufactureYear) {
    super(plate, manufactureYear);
    this.setFuelType("Flex");
  }

  @Override
  public void toFuel(String place, String driver, double price) {
    System.out.println(
        "Abastecendo carro: \n"
        + " Placa: " + this.getPlate()
        + " Local: " + place
        + " Motorista: " + driver
        + " Valor: " + price
    );

    super.toFuel(place, driver, price);
  }

  @Override
  public void refuellingsList() {
    System.out.println("+-- Lista de Abastecimentos para o carro: " + this.getPlate() + "--+");
    for (String refuelling : this.getRefuellings()) {
      System.out.println("|" + refuelling + "\t|");
    }

    System.out.println("+--------------------------------- Fim ---------------------------------+");
  }
}
