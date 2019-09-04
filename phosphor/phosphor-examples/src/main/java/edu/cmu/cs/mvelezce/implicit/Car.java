package edu.cmu.cs.mvelezce.implicit;

public class Car {

  private String name;
  private int year;
  private boolean used;

  public Car(String name, int year, boolean used) {
    this.name = name;
    this.year = year;
    this.used = used;
  }

  public static Car copy(Car car) {
    return new Car(car.name, 2019, car.used);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isUsed() {
    return used;
  }

  public void setUsed(boolean used) {
    this.used = used;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    //    Car car = (Car) o;
    //
    //    if (year != car.year) {
    //      return false;
    //    }
    //    if (used != car.used) {
    //      return false;
    //    }
    //    return name.equals(car.name);
    return true;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + year;
    result = 31 * result + (used ? 1 : 0);
    return result;
  }
}
