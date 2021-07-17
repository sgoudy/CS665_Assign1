/*
    Shelby Goudy
    CS665 O2
    Wk 1 Assignment
    13 Jul 21
*/

package edu.bu.met.cs665;

import edu.bu.met.cs665.vendingMachine.*;
import edu.bu.met.cs665.beverages.BlackTea;
import edu.bu.met.cs665.beverages.Espresso;
import edu.bu.met.cs665.beverages.GreenTea;
import edu.bu.met.cs665.beverages.HotBev;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestVendingMachine {

  HotBev bev;
  VendingMachine vm;

  public TestVendingMachine() {}


  /**
   * Instantiates new Vending Machine and stocks it full.
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    vm = new VendingMachine();
    vm.stockMachine();
  }


  /**
   * Tests makeRequest method. Should instantiate new Black Tea, add sugars and milks
   * and return message about only allowing 3 of each, maximum.
   */
  @Test
  public void makeRequest(){
    vm.makeRequest("black tea");
    bev = new BlackTea();
    bev.addMilk(2);
    bev.addSugar(2);
    bev.addMilk(3);
    bev.addSugar(2);
    Assert.assertEquals(3, bev.getMilk());
  }


  /**
   * Tests stock change after instantiating new Americano.
   */
  @Test
  public void stock(){
    Assert.assertEquals(40, vm.getAmericanoStock());
    vm.makeRequest("americano");
    Assert.assertEquals(39, vm.getAmericanoStock());
  }


  /**
   * Tests getPrice method after instantiating new Espresso.
   */
  @Test
  public void getPriceEspresso() {
    HotBev esp = new Espresso();
    Assert.assertEquals("3.00", esp.getPrice());
  }


  /**
   * Tests getType method after instantiating new Black Tea.
   */
  @Test
  public void getTypeBlackTea() {
    HotBev bt = new BlackTea();
    Assert.assertEquals("Black Tea", bt.getType());
  }


  /**
   * Tests addMilk for limit of 3 milks. Same for sugar.
   */
  @Test
  public void addMilkBlackTea() {
    HotBev bt = new BlackTea();
    bt.addMilk(4); // does not allow for more than 3 milks
    Assert.assertEquals(3, bt.getMilk());
  }


  /**
   * Tests setPrice method after instantiating and changing the price of an Espresso.
   */
  @Test
  public void setPriceEspresso() {
    HotBev esp = new Espresso();
    esp.setPrice("12.00");
    Assert.assertEquals("12.00", esp.getPrice());
  }


  /**
   * Tests getDescription method after instantiating new Green Tea.
   */
  @Test
  public void getDescriptionGreenTea() {

    HotBev gt = new GreenTea();
    Assert.assertEquals("green coloring, healthy flavor",
            gt.getDescription());
  }

}
