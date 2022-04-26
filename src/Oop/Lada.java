package Oop;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Lada extends Car {

  private int numberOfPurchases;
  private int numberOfDealers;

  public Lada(String name, int number, int year, int month, int day,
      Brand brand, boolean inMoving, int numberOfPurchases, int numberOfDealers) {
    super(name, number, year, month, day, brand, inMoving);
    this.numberOfPurchases = numberOfPurchases;
    this.numberOfDealers = numberOfDealers;
  }

  public int getNumberOfPurchases() {
    return numberOfPurchases;
  }

  public void setNumberOfPurchases(int numberOfPurchases) {
    this.numberOfPurchases = numberOfPurchases;
  }

  public int getnumberOfDealers() {
    return numberOfDealers;
  }

  public void setnumberOfDealers(int numberOfDealers) {
    this.numberOfDealers = numberOfDealers;
  }

  public void crash() {
    System.out.println("Я постоянно ломаюсь");
  }

  public void razgon() {
    System.out.println("Я очень долго разгоняюсь");
  }

  @Override
  public void move() {
    System.out.println("Машина недвижема");
  }

  public void driving(String str) {
    System.out.println("Машина едет слишком медленно" + str);
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

  public void stoping() {
    System.out.println("Машина хреново тормозит");
  }



}
