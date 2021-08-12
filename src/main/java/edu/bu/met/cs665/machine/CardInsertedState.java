package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public class CardInsertedState implements State {

  CoffeeMachine coffeeMachine;

  public CardInsertedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
  }

  @Override
  public void cardAccepted() {
    coffeeMachine.setState(coffeeMachine.getCardAcceptedState());
  }

  @Override
  public void cardDeclined() {
    System.out.println("Card declined!");
    coffeeMachine.setState(coffeeMachine.getCardDeclinedState());
  }

  @Override
  public HotBeverages selectionMade(String drink) {
    return null;
  }

  @Override
  public void drinkDispensed() {

  }

  @Override
  public void soldOut() {
    System.out.println("Sold Out.");
  }
}
