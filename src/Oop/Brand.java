package Oop;

public enum Brand {
  AUDI("audi", "Germany", 2.5),
  BMW("bmw", "Germany", 4.0),
  MERCEDES("mercedes", "Germany", 6.3),
  LADA("govnovoz", "RussiaPidorussia", 1.4);
  private final String nameOfCar;
  private final String country;
  private final double engine;

  Brand(String nameOfCar, String country, double engine) {
    this.nameOfCar = nameOfCar;
    this.country = country;
    this.engine = engine;
  }

  public String getNameOfCar() {
    return nameOfCar;
  }


  public String getCountry() {
    return country;
  }

  public double getEngine() {
    return engine;
  }


}

