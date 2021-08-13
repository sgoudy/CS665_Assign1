/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.Americano;
import edu.bu.met.cs665.drinks.BlackTea;
import edu.bu.met.cs665.drinks.Espresso;
import edu.bu.met.cs665.drinks.GreenTea;
import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.drinks.LatteMacchiato;
import edu.bu.met.cs665.drinks.YellowTea;

/**
 * This class allows the user to select their desired drink
 */
public class CardAcceptedState implements State {

  HotBeverages bev;
  CoffeeMachine coffeeMachine;

  public CardAcceptedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
  }

  @Override
  public void cardInserted() {
  }

  @Override
  public void cardAccepted() {
  }

  @Override
  public void cardDeclined() {
  }

  /**
   * This is what creates the HotBeverages object and returns it for manipulation with the decorator
   * classes, Milk and Sugar.
   *
   * @param drink String, input by respective button
   * @return HotBeverages object if not sold out
   */
  @Override
  public HotBeverages selectionMade(String drink) {
    // Get quantity of machine and reduce when button is pressed for selection
    int qty = coffeeMachine.getBevQty();

    if (drink.equals("espresso")) {

      bev = new Espresso();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());

      --qty;
    } else if (drink.equals("americano")) {

      bev = new Americano();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());
      --qty;
    } else if (drink.equals("latte macchiato")) {

      bev = new LatteMacchiato();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());
      --qty;
    } else if (drink.equals("black tea")) {

      bev = new BlackTea();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());
      --qty;
    } else if (drink.equals("yellow tea")) {

      bev = new YellowTea();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());
      --qty;
    } else if (drink.equals("green tea")) {

      bev = new GreenTea();
      System.out.println(bev.getName() + "\n\tPrice: $" + bev.getPrice());
      --qty;
    }
    // reduce vending machine quantity by 1
    coffeeMachine.setBevQty(qty);

    System.out.println("Pouring your " + bev.getName());
    coffeeMachine.setState(coffeeMachine.getDrinkDispensedState(bev));
    return bev;
  }

  @Override
  public void drinkDispensed(HotBeverages bev) {
  }

  @Override
  public String soldOut() {
    return null;
  }
}