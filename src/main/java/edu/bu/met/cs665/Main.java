package edu.bu.met.cs665;

import edu.bu.met.cs665.assg1.*;


public class Main {

  public static VendingMachine machine;
  private static HotBev bev;
  private static String type;


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // stock a new machine
    machine = stockMachine();

    // User chooses type
    type = "espresso";

    machine.checkAvailability(type);
    if (machine.checkAvailability(type)){
      System.out.println(type + " is available! Dispensing now...");
      bev.addMilk(2);
      bev.addSugar(2);
      bev.addMilk(3);
      bev.addSugar(16);
      bev.getPrice();
    }

    // User chooses another type
    type = "black tea";

    machine.checkAvailability(type);
    if (machine.checkAvailability(type)){
      System.out.println(type + " is available! Dispensing now...");
      bev.addMilk(2);
      bev.addSugar(2);
      bev.addMilk(3);
      bev.addSugar(2);
      bev.getPrice();
    }

  }

  /**
   *
   * @return
   */
  public static VendingMachine stockMachine(){
    VendingMachine machine = new VendingMachine();
    machine.stockMachine();
    return machine;
  }


  /**
   *
   * @param type
   * @return
   */
  public static HotBev makeDrink(String type) {
    switch (type){
      case "espresso":
        bev = new Espresso();
        break;
      case "americano":
        bev = new Americano();
        break;
      case "latte macchiato":
        bev = new LatteMacchiato();
        break;
      case "green tea":
        bev = new GreenTea();
        break;
      case "black tea":
        bev = new BlackTea();
        break;
      case "yellow tea":
        bev = new YellowTea();
        break;
    }
    return bev;
  }

}
