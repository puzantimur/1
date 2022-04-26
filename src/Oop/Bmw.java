package Oop;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Bmw extends Car {
  private double cost;
  private double averageOfGas;

  public Bmw(String name, int number, int year, int month, int day,
      Brand brand, boolean inMoving, double cost, double averageOfGas) {
    super(name, number, year, month, day, brand, inMoving);
    this.cost = cost;
    this.averageOfGas = averageOfGas;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public double getAverageOfGas() {
    return averageOfGas;
  }

  public void setAverageOfGas(double averageOfGas) {
    this.averageOfGas = averageOfGas;
  }

  public void driving () {
    System.out.println("Машина едет слишком быстро");
  }

  public void stoping() {
    System.out.println("Машина отлично тормозит");
  }

  public void prestizh() {
    System.out.println("Я престижная машина");
  }

  public void want() {
    System.out.println("Все хотят эту машину");
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }



  @Override
  public void move() {
    System.out.println("Машина движема");

  }






}
