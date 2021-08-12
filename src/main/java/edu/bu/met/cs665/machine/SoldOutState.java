package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public class SoldOutState implements State {

  CoffeeMachine coffeeMachine;

  public SoldOutState(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Sold Out.");
  }

  @Override
  public void cardAccepted() {
    System.out.println("Sold Out.");
  }

  @Override
  public void cardDeclined() {
    System.out.println("Sold Out.");
  }

  @Override
  public HotBeverages selectionMade(String drink) {
    System.out.println("Sold Out.");
    return null;
  }

  @Override
  public void drinkDispensed() {
    System.out.println("Sold Out.");
  }

  @Override
  public void soldOut() {
    System.out.println("Sold Out.");
  }
}
