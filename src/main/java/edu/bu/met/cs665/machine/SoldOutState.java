/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * This class doesn't allow for any operations until the inventory is reset.
 */
public class SoldOutState implements State {

  CoffeeMachine coffeeMachine;

  public SoldOutState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("SOLD OUT");
  }

  @Override
  public void cardInserted() {
    System.out.println("SOLD OUT");
  }

  @Override
  public void cardAccepted() {
    System.out.println("SOLD OUT");
  }

  @Override
  public void cardDeclined() {
    System.out.println("SOLD OUT");
  }

  @Override
  public HotBeverages selectionMade(String drink) {
    System.out.println("SOLD OUT");
    return null;
  }

  @Override
  public void drinkDispensed(HotBeverages bev) {
    System.out.println("SOLD OUT");
  }

  @Override
  public String soldOut() {
    String message = "Sold out";
    System.out.println("SOLD OUT");
    return message;
  }
}
