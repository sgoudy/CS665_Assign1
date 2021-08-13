/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.drinks;

public class Sugar extends Condiments {


  public Sugar(HotBeverages hotBeverages) {
    this.hotBeverages = hotBeverages;
  }

  @Override
  public String getName() {
    return hotBeverages.getName() + ", sugar";
  }

  /**
   * This adds 10 cents to the purchase price each time
   *
   * @return double, price
   */
  @Override
  public double getPrice() {
    double price = hotBeverages.getPrice();
    double cost = price + .1;
    hotBeverages.setPrice(cost);
    return cost;
  }
}
