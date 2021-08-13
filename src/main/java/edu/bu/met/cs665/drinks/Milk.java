/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.drinks;

public class Milk extends Condiments {

  public Milk(HotBeverages hotBeverages) {
    this.hotBeverages = hotBeverages;
  }

  @Override
  public String getName() {
    return hotBeverages.getName() + ", milk";
  }

  /**
   * This adds 15 cents to the purchase price each time
   *
   * @return double, price
   */
  @Override
  public double getPrice() {
    double price = hotBeverages.getPrice();
    double cost = price + .15;
    hotBeverages.setPrice(cost);
    return cost;
  }
}
