/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * Initial state of machine when no card has been inserted and inventory > 0
 */
public class InsertCardState implements State {

  CoffeeMachine coffeeMachine;

  public InsertCardState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("\nPlease insert a payment card.");
  }

  @Override
  public void cardInserted() {
    System.out.println("Verifying payment, please wait...");
    coffeeMachine.setState(coffeeMachine.getCardInsertedState());
  }

  @Override
  public void cardAccepted() {

  }

  @Override
  public void cardDeclined() {

  }

  @Override
  public HotBeverages selectionMade(String drink) {
    this.insertCard();
    return null;
  }

  @Override
  public void drinkDispensed(HotBeverages bev) {

  }

  @Override
  public void soldOut() {
    System.out.println("Sold Out.");
  }
}
