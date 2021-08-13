/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * This class enforces resetting of the coffee machine state to Insert Card state if the user
 */
public class CardDeclinedState implements State {

  CoffeeMachine coffeeMachine;

  public CardDeclinedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
    coffeeMachine.setState(coffeeMachine.getInsertCardState());
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

  @Override
  public HotBeverages selectionMade(String drink) {
    System.out
        .println("Card was declined, please insert a different card before making a selection.");
    return null;
  }

  @Override
  public void drinkDispensed(HotBeverages bev) {
  }

  @Override
  public String soldOut() {
    System.out.println("Sold Out.");
    return null;
  }
}
