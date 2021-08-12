package edu.bu.met.cs665.drinks;

/**
 * REFACTORED: HotBeverages implements the Decorator Pattern.
 */
public abstract class HotBeverages {

  private String name;
  private double price;
  private int qtySugar;
  private int qtyMilk;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQtySugar() {
    return qtySugar;
  }

  public void setQtySugar(int qtySugar) {
    this.qtySugar = qtySugar;
  }

  public int getQtyMilk() {
    return qtyMilk;
  }

  public void setQtyMilk(int qtyMilk) {
    this.qtyMilk = qtyMilk;
  }
}
