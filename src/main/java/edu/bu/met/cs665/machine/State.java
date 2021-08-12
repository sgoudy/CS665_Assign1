package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public interface State {

  void insertCard();
  void cardAccepted();
  void cardDeclined();
  HotBeverages selectionMade(String drink);
  void drinkDispensed();
  void soldOut();

}
