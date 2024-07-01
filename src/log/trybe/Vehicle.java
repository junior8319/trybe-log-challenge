package log.trybe;

import java.util.ArrayList;

public abstract class Vehicle {
  private String plate;
  private int manufactureYear;
  private String fuelType;
  private ArrayList<String> refuellings;

  public Vehicle(String plate, int manufactureYear) {
    this.plate = plate;
    this.manufactureYear = manufactureYear;
    this.refuellings = new ArrayList<>();
  }

  public String getPlate() {
    return plate;
  }

  public int getManufactureYear() {
    return manufactureYear;
  }

  public String getFuelType() {
    return fuelType;
  }

  public ArrayList<String> getRefuellings() {
    return refuellings;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public void setRefuellings(ArrayList refuellings) {
    this.refuellings = refuellings;
  }

  public void toFuel(String place, String driver, double price){
    this.getRefuellings().add(
        "Local: " + place + "\n"
            + "Motorista: " + driver + "\n"
            + "Valor: " + price
    );
  };
  public void refuellingsList() {
    System.out.println("+-- Lista de Abastecimentos para o veículo: " + this.getPlate() + "--+");
    for (String refuelling : this.getRefuellings()) {
      System.out.println("|" + refuelling + "\t|");
    }

    System.out.println("+--------------------------------- Fim ---------------------------------+");
  };
}
