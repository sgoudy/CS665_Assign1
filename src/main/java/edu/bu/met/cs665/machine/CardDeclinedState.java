package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public class CardDeclinedState implements State {

  CoffeeMachine coffeeMachine;

  public CardDeclinedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Please insert a new card");
  }

  @Override
  public void cardAccepted() {
    System.out.println("Payment accepted");
  }

  @Override
  public void cardDeclined() {
    System.out.println("Card declined.");

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
