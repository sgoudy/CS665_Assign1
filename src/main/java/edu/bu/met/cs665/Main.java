/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.drinks.Milk;
import edu.bu.met.cs665.drinks.Sugar;
import edu.bu.met.cs665.machine.CoffeeMachine;

public class Main {

  /**
   * A main method to run examples.
   * @param args not used
   */
  public static void main(String[] args) {

    // REFACTORED *Singleton pattern
    CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
    // REFACTORED *State pattern
    coffeeMachine.insertCard();
    coffeeMachine.cardAccepted();
    HotBeverages drink =
        coffeeMachine.selectionMade("americano");
    coffeeMachine.drinkDispensed();

    // REFACTORED *Decorator pattern
    drink = new Sugar(drink);
    drink = new Milk(drink);
    System.out.println(drink.getPrice());
    System.out.println(drink.getName());
  }
}
