package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public class DrinkDispensedState implements State {

  CoffeeMachine coffeeMachine;

  public DrinkDispensedState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {

  }

  @Override
  public void cardAccepted() {

  }

  @Override
  public void cardDeclined() {

  }

  @Override
  public HotBeverages selectionMade(String drink) {
    return null;
  }

  @Override
  public void drinkDispensed() {
    System.out.println("Enjoy!");
  }

  @Override
  public void soldOut() {

  }
}
