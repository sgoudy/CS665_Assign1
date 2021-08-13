/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.drinks.Milk;
import edu.bu.met.cs665.drinks.Sugar;
import edu.bu.met.cs665.machine.CoffeeMachine;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    HotBeverages drink;

    // REFACTORED *Singleton pattern
    CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
    // REFACTORED *State pattern

    coffeeMachine.cardInserted();
    coffeeMachine.cardDeclined();

    // Try again with new card
    coffeeMachine.insertCard();
    coffeeMachine.cardInserted();
    coffeeMachine.cardAccepted();
    drink = coffeeMachine.selectionMade("americano");
    coffeeMachine.drinkDispensed(drink);

    // Add condiments
    coffeeMachine.addSugar(drink);
    coffeeMachine.addSugar(drink);
    coffeeMachine.addMilk(drink);
    coffeeMachine.addMilk(drink);
    coffeeMachine.addMilk(drink);
    coffeeMachine.addMilk(drink);  // Checking for limit of 3
    coffeeMachine.addSugar(drink);
    coffeeMachine.addSugar(drink); // Checking for limit of 3

    // Try to make another selection without inserting a payment card
    drink = coffeeMachine.selectionMade("latte macchiato");
    coffeeMachine.drinkDispensed(drink);

    // Insert a payment card for another drink
    coffeeMachine.cardInserted();
    coffeeMachine.cardAccepted();
    drink = coffeeMachine.selectionMade("espresso");
    coffeeMachine.drinkDispensed(drink);

    // Insert a payment card for another drink, but it's now SOLD OUT
    coffeeMachine.insertCard(); // SOLD OUT
    coffeeMachine.cardInserted(); // SOLD OUT
    coffeeMachine.cardAccepted(); // SOLD OUT
    drink = coffeeMachine.selectionMade("latte macchiato"); // SOLD OUT
    coffeeMachine.drinkDispensed(drink); // SOLD OUT
  }
}
