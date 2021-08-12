package edu.bu.met.cs665.drinks;

public class Sugar extends Condiments{


  public Sugar(HotBeverages hotBeverages) {
    this.hotBeverages = hotBeverages;
  }

    @Override
    public String getName() {
      return hotBeverages.getName() + ", sugar";
    }

    @Override
    public double getPrice(){
      double price = hotBeverages.getPrice();
      double cost = price + .25;

      hotBeverages.setPrice(cost);
      return cost;
    }
}
