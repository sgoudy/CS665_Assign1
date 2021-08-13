/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;
import edu.bu.met.cs665.drinks.Milk;
import edu.bu.met.cs665.drinks.Sugar;

/**
 * REFACTORED: CoffeeMachine implements the State & Singleton patterns.
 */
public class CoffeeMachine {

  // * REFACTORED SINGLETON pattern
  private static CoffeeMachine instance;

  State insertCardState;
  State cardInsertedState;
  State cardDeclinedState;
  State cardAcceptedState;
  State drinkDispensedState;
  State soldOutState;

  State state;

  private int bevQty;
  private Sugar sugar;
  private Milk milk;

  private CoffeeMachine() {
    insertCardState = new InsertCardState(this);
    cardInsertedState = new CardInsertedState(this);
    cardDeclinedState = new CardDeclinedState(this);
    cardAcceptedState = new CardAcceptedState(this);
    drinkDispensedState = new DrinkDispensedState(this);
    soldOutState = new SoldOutState(this);

    // Set initial inventory
    setBevQty(2);
    state = insertCardState;
  }

  /**
   * Singleton pattern to return one Coffee Machine
   *
   * @return CoffeeMachine
   */
  public static CoffeeMachine getInstance() {
    if (instance == null) {
      instance = new CoffeeMachine();
    }
    return instance;
  }

  /**
   * REFACTORED Decorator pattern that returns a sugar that wraps the beverage argument
   *
   * @param bev HotBeverages drink to add sugar into
   * @return sugar
   */
  public Sugar addSugar(HotBeverages bev) {
    sugar = new Sugar(bev);

    // If the user hasn't reached their 3 sugar limit
    if (bev.getQtySugar() < 3) {
      bev.setQtySugar(bev.getQtySugar() + 1);
      System.out
          .println("Total sugars added: " + bev.getQtySugar() + "\n\tPrice: $" + sugar.getPrice());
      return sugar;

      // If they have reached their limit
    } else {
      System.out.println("Sorry! Total sugars allowed: 3");
      return null;
    }
  }

  /**
   * REFACTORED Decorator pattern that returns a milk that wraps the beverage argument
   *
   * @param bev HotBeverages drink to add milk into
   * @return milk
   */
  public Milk addMilk(HotBeverages bev) {
    milk = new Milk(bev);

    // If the user hasn't reached their 3 sugar limit
    if (bev.getQtyMilk() < 3) {
      bev.setQtyMilk(bev.getQtyMilk() + 1);
      System.out
          .println("Total milks added: " + bev.getQtyMilk() + "\n\tPrice: $" + milk.getPrice());
      return milk;

      // If they have reached their limit
    } else {
      System.out.println("Sorry! Total milks allowed: 3");
      return null;
    }
  }

  // ------------- CoffeeMachine total drink inventory -------------------

  public int getBevQty() {
    return bevQty;
  }

  public void setBevQty(int bevQty) {
    this.bevQty = bevQty;
  }

  // ------------ Coffee Machine Functionality ---------------

  public void insertCard() {
    state.insertCard();
  }

  public void cardInserted() {
    state.cardInserted();
  }

  public void cardAccepted() {
    state.cardAccepted();
  }

  public void cardDeclined() {
    state.cardDeclined();
  }

  public HotBeverages selectionMade(String drink) {
    HotBeverages drink1 = state.selectionMade(drink);
    return drink1;
  }

  public void drinkDispensed(HotBeverages bev) {
    state.drinkDispensed(bev);
  }

  public void soldOut() {
    state.soldOut();
  }

  // --------- To swap between CoffeeMachine states --------------

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getInsertCardState() {
    return insertCardState;
  }

  public State getCardInsertedState() {
    return cardInsertedState;
  }

  public State getCardDeclinedState() {
    return cardDeclinedState;
  }

  public State getCardAcceptedState() {
    return cardAcceptedState;
  }

  public State getDrinkDispensedState(HotBeverages bev) {
    return drinkDispensedState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }
}
