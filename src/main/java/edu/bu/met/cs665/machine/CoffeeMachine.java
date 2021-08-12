package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

/**
 * REFACTORED: CoffeeMachine implements the State & Singleton patterns.
 */
public class CoffeeMachine {

  // SINGLETON
  private static CoffeeMachine instance;

  private CoffeeMachine(){
    insertCardState = new CardInsertedState(this);
    cardDeclinedState = new CardDeclinedState(this);
    cardAcceptedState = new CardAcceptedState(this);
    drinkDispensedState = new DrinkDispensedState(this);
    soldOutState = new SoldOutState(this);

    state = insertCardState;
  }

  public static CoffeeMachine getInstance(){
    if (instance == null){
      instance = new CoffeeMachine();
    }
    return instance;
  }

  State insertCardState;
  State cardDeclinedState;
  State cardAcceptedState;
  State drinkDispensedState;
  State soldOutState;

  State state;


  public void insertCard() {
    state.insertCard();
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

  public void drinkDispensed() {
    state.drinkDispensed();
  }

  public void soldOut() {
    state.soldOut();
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getInsertCardState() {
    return insertCardState;
  }

  public State getCardDeclinedState() {
    return cardDeclinedState;
  }

  public State getCardAcceptedState() {
    return cardAcceptedState;
  }

  public State getDrinkDispensedState() {
    return drinkDispensedState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }
}
