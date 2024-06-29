package log.trybe;

import java.util.List;

public abstract class Vehicle {
  String plate;
  int manufactureYear;
  String fuelType;
  List refuellings;

  public abstract void toFuel(String place, String driver, double price);
  public abstract void refuellingsList();
}
