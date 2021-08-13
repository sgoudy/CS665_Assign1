/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * This class will print a message upon dispensing and can set the state to Sold Out if quantity =
 * 0. It also prevents a user from making another selection until another payment is authorized.
 */
public class DrinkDispensedState implements State {

  CoffeeMachine coffeeMachine;

  public DrinkDispensedState(CoffeeMachine coffeeMachine) {
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
   * Return Coffee Machine to unpaid "Insert Card" state before a user can select another drink
   *
   * @param drink
   * @return null
   */
  @Override
  public HotBeverages selectionMade(String drink) {
    System.out.println("\n");
    coffeeMachine.setState(coffeeMachine.getInsertCardState());
    return null;
  }

  /**
   * Message to buyer. Set Machine to Sold Out if quantity equals 0, otherwise reset to Insert Card
   * State.
   *
   * @param bev HotBeverages object
   */
  @Override
  public void drinkDispensed(HotBeverages bev) {
    System.out.println(
        "Enjoy!\n\tFor an additional charge, add milk or sugar by pressing 'Milk' or 'Sugar'");

    // Set Machine to Sold Out state if 0 drinks remaining
    if (coffeeMachine.getBevQty() == 0) {
      coffeeMachine.setState(coffeeMachine.getSoldOutState());
    } else {

      // Otherwise, reset to initial Insert Card state
      coffeeMachine.setState(coffeeMachine.getInsertCardState());
    }
  }

  @Override
  public void soldOut() {
  }
}
