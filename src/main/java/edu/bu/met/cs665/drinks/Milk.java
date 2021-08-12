package edu.bu.met.cs665.drinks;

public class Milk extends Condiments{

  public Milk(HotBeverages hotBeverages) {
    this.hotBeverages = hotBeverages;
  }

  @Override
  public String getName() {
    return hotBeverages.getName() + ", milk";
  }

  @Override
  public double getPrice() {
    double price = hotBeverages.getPrice();
    double cost = price + .1;
    hotBeverages.setPrice(cost);
    return cost;
  }
}
