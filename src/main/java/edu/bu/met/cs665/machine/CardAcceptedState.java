package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.Americano;
import edu.bu.met.cs665.drinks.BlackTea;
import edu.bu.met.cs665.drinks.Espresso;
import edu.bu.met.cs665.drinks.GreenTea;
import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.drinks.LatteMacchiato;
import edu.bu.met.cs665.drinks.YellowTea;

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
  public void cardAccepted(){
  }

  @Override
  public void cardDeclined() {
  }

  @Override
  public HotBeverages selectionMade(String drink) {
    System.out.print("Dispensing...");
    if (drink.equals("espresso")) {
      System.out.println("espresso");
      bev = new Espresso();
    } else if (drink.equals("americano")) {
      System.out.println("americano");
      bev = new Americano();
    } else if (drink.equals("latte macchiato")) {
      System.out.println("latte macchiato");
      bev = new LatteMacchiato();
    } else if (drink.equals("black tea")) {
      System.out.println("black tea");
      bev = new BlackTea();
    } else if (drink.equals("yellow tea")) {
      System.out.println("yellow tea");
      bev = new YellowTea();
    } else if (drink.equals("green tea")){
      System.out.println("green tea");
      bev = new GreenTea();
    } else {
      return null;
    }
    coffeeMachine.setState(coffeeMachine.getDrinkDispensedState());
    return bev;
  }

  @Override
  public void drinkDispensed() {
  }

  @Override
  public void soldOut() {
    System.out.println("Sold Out.");
  }
}