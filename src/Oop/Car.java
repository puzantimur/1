package Oop;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Car implements Movable {

  protected String name;
  protected int number;
  protected LocalDate date;
  protected int year;
  protected int month;
  protected int day;
  protected Brand brand;
  protected boolean inMoving;

  public Car(String name, int number, int year, int month, int day,
      Brand brand, boolean inMoving) {
    this.name = name;
    this.number = number;
    this.date = LocalDate.of(year, month, day);
    this.year = year;
    this.month = month;
    this.day = day;
    this.brand = brand;
    this.inMoving = inMoving;
  }

  protected void driving() {
    System.out.println("Машина умеет ехать");
       }


  protected void stoping() {
    System.out.println("Машина умеет тормозить");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Car)) {
      return false;
    }
    Car car = (Car) o;
    return number == car.number && year == car.year && month == car.month && day == car.day
        && inMoving == car.inMoving && name.equals(car.name) && date.equals(car.date)
        && brand == car.brand;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number, date, year, month, day, brand, inMoving);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Car{");
    sb.append("name='").append(name).append('\'');
    sb.append(", number=").append(number);
    sb.append(", date=").append(date);
    sb.append(", year=").append(year);
    sb.append(", month=").append(month);
    sb.append(", day=").append(day);
    sb.append(", brand=").append(brand);
    sb.append(", inMoving=").append(inMoving);
    sb.append('}');
    return sb.toString();
  }


}














