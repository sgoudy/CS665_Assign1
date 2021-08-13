/*
    Shelby Goudy
    CS665 O2
    Wk 6 Assignment
    17 Aug 21
*/

package edu.bu.met.cs665.machine;

import edu.bu.met.cs665.drinks.HotBeverages;

public interface State {

  void insertCard();

  void cardInserted();

  void cardAccepted();

  void cardDeclined();

  HotBeverages selectionMade(String drink);

  void drinkDispensed(HotBeverages bev);

  void soldOut();

}
