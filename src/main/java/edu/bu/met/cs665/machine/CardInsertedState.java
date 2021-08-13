/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * This class defines what happens once a payment card is inserted
 */
public class CardInsertedState implements State {

  CoffeeMachine coffeeMachine;

  public CardInsertedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {

  }

  @Override
  public void cardInserted() {
  }

  /**
   * Sets machine to Card Accepted state.
   */
  @Override
  public void cardAccepted() {
    System.out.println("Please select a drink...");
    coffeeMachine.setState(coffeeMachine.getCardAcceptedState());
  }

  /**
   * Resets machine to Insert Card state
   */
  @Override
  public void cardDeclined() {
    System.out.println("Card declined!");
    coffeeMachine.setState(coffeeMachine.getCardDeclinedState());
  }

  /**
   * Does not allow user to make a selection until card is approved or declined
   *
   * @param drink
   * @return
   */
  @Override
  public HotBeverages selectionMade(String drink) {
    System.out.println("Please wait, verifying...");
    return null;
  }

  @Override
  public void drinkDispensed(HotBeverages bev) {

  }

  /**
   * Returns string for testing.
   *
   * @return message, String
   */
  @Override
  public String soldOut() {
    String message = "Sold out";
    return message;
  }
}
